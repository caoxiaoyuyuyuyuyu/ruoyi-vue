package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.schoolInfo.domain.ClassInfo;
import com.ruoyi.schoolInfo.mapper.MajorInfoMapper;
import com.ruoyi.schoolInfo.domain.MajorInfo;
import com.ruoyi.schoolInfo.service.IMajorInfoService;

/**
 * 专业信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class MajorInfoServiceImpl implements IMajorInfoService 
{
    @Autowired
    private MajorInfoMapper majorInfoMapper;

    /**
     * 查询专业信息
     * 
     * @param majorId 专业信息主键
     * @return 专业信息
     */
    @Override
    public MajorInfo selectMajorInfoByMajorId(Long majorId)
    {
        return majorInfoMapper.selectMajorInfoByMajorId(majorId);
    }

    /**
     * 查询专业信息列表
     * 
     * @param majorInfo 专业信息
     * @return 专业信息
     */
    @Override
    public List<MajorInfo> selectMajorInfoList(MajorInfo majorInfo)
    {
        return majorInfoMapper.selectMajorInfoList(majorInfo);
    }

    /**
     * 新增专业信息
     * 
     * @param majorInfo 专业信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertMajorInfo(MajorInfo majorInfo)
    {
        int rows = majorInfoMapper.insertMajorInfo(majorInfo);
        insertClassInfo(majorInfo);
        return rows;
    }

    /**
     * 修改专业信息
     * 
     * @param majorInfo 专业信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateMajorInfo(MajorInfo majorInfo)
    {
        majorInfoMapper.deleteClassInfoByMajorId(majorInfo.getMajorId());
        insertClassInfo(majorInfo);
        return majorInfoMapper.updateMajorInfo(majorInfo);
    }

    /**
     * 批量删除专业信息
     * 
     * @param majorIds 需要删除的专业信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMajorInfoByMajorIds(Long[] majorIds)
    {
        majorInfoMapper.deleteClassInfoByMajorIds(majorIds);
        return majorInfoMapper.deleteMajorInfoByMajorIds(majorIds);
    }

    /**
     * 删除专业信息信息
     * 
     * @param majorId 专业信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteMajorInfoByMajorId(Long majorId)
    {
        majorInfoMapper.deleteClassInfoByMajorId(majorId);
        return majorInfoMapper.deleteMajorInfoByMajorId(majorId);
    }

    /**
     * 新增班级信息信息
     * 
     * @param majorInfo 专业信息对象
     */
    public void insertClassInfo(MajorInfo majorInfo)
    {
        List<ClassInfo> classInfoList = majorInfo.getClassInfoList();
        Long majorId = majorInfo.getMajorId();
        if (StringUtils.isNotNull(classInfoList))
        {
            List<ClassInfo> list = new ArrayList<ClassInfo>();
            for (ClassInfo classInfo : classInfoList)
            {
                classInfo.setMajorId(majorId);
                list.add(classInfo);
            }
            if (list.size() > 0)
            {
                majorInfoMapper.batchClassInfo(list);
            }
        }
    }
}

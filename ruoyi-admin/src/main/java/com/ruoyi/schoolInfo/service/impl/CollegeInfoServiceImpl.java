package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.service.IMajorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.schoolInfo.domain.MajorInfo;
import com.ruoyi.schoolInfo.mapper.CollegeInfoMapper;
import com.ruoyi.schoolInfo.domain.CollegeInfo;
import com.ruoyi.schoolInfo.service.ICollegeInfoService;

/**
 * 学院信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class CollegeInfoServiceImpl implements ICollegeInfoService 
{
    @Autowired
    private CollegeInfoMapper collegeInfoMapper;

    @Autowired
    private IMajorInfoService majorInfoService;

    /**
     * 查询学院信息
     * 
     * @param collegeId 学院信息主键
     * @return 学院信息
     */
    @Override
    public CollegeInfo selectCollegeInfoByCollegeId(Long collegeId)
    {
        return collegeInfoMapper.selectCollegeInfoByCollegeId(collegeId);
    }

    /**
     * 查询学院信息列表
     * 
     * @param collegeInfo 学院信息
     * @return 学院信息
     */
    @Override
    public List<CollegeInfo> selectCollegeInfoList(CollegeInfo collegeInfo)
    {
        return collegeInfoMapper.selectCollegeInfoList(collegeInfo);
    }

    /**
     * 新增学院信息
     * 
     * @param collegeInfo 学院信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCollegeInfo(CollegeInfo collegeInfo)
    {
        int rows = collegeInfoMapper.insertCollegeInfo(collegeInfo);
        insertMajorInfo(collegeInfo);
        return rows;
    }

    /**
     * 修改学院信息
     * 
     * @param collegeInfo 学院信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCollegeInfo(CollegeInfo collegeInfo)
    {
//        collegeInfoMapper.deleteMajorInfoByCollegeId(collegeInfo.getCollegeId());
//        insertMajorInfo(collegeInfo);
        return collegeInfoMapper.updateCollegeInfo(collegeInfo);
    }

    /**
     * 批量删除学院信息
     * 
     * @param collegeIds 需要删除的学院信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCollegeInfoByCollegeIds(Long[] collegeIds)
    {
        List<Long> majorInfoList = collegeInfoMapper.selectmajorInfoByCollegeIds(collegeIds);
        System.out.println("**majorInfoList"+majorInfoList.toString());
        majorInfoService.deleteMajorInfoByMajorIds(majorInfoList.toArray(new Long[0]));
        return collegeInfoMapper.deleteCollegeInfoByCollegeIds(collegeIds);
    }

    /**
     * 删除学院信息信息
     * 
     * @param collegeId 学院信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCollegeInfoByCollegeId(Long collegeId)
    {
        collegeInfoMapper.deleteMajorInfoByCollegeId(collegeId);
        return collegeInfoMapper.deleteCollegeInfoByCollegeId(collegeId);
    }

    /**
     * 新增专业信息信息
     * 
     * @param collegeInfo 学院信息对象
     */
    public void insertMajorInfo(CollegeInfo collegeInfo)
    {
        List<MajorInfo> majorInfoList = collegeInfo.getMajorInfoList();
        Long collegeId = collegeInfo.getCollegeId();
        if (StringUtils.isNotNull(majorInfoList))
        {
            List<MajorInfo> list = new ArrayList<MajorInfo>();
            for (MajorInfo majorInfo : majorInfoList)
            {
                majorInfo.setCollegeId(collegeId);
                list.add(majorInfo);
            }
            if (list.size() > 0)
            {
                collegeInfoMapper.batchMajorInfo(list);
            }
        }
    }
}

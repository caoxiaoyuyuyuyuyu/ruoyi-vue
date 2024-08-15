package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.schoolInfo.domain.CollegeInfo;
import com.ruoyi.schoolInfo.mapper.GradeInfoMapper;
import com.ruoyi.schoolInfo.domain.GradeInfo;
import com.ruoyi.schoolInfo.service.IGradeInfoService;

/**
 * 年级信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class GradeInfoServiceImpl implements IGradeInfoService 
{
    @Autowired
    private GradeInfoMapper gradeInfoMapper;

    /**
     * 查询年级信息
     * 
     * @param gradeId 年级信息主键
     * @return 年级信息
     */
    @Override
    public GradeInfo selectGradeInfoByGradeId(Long gradeId)
    {
        return gradeInfoMapper.selectGradeInfoByGradeId(gradeId);
    }

    /**
     * 查询年级信息列表
     * 
     * @param gradeInfo 年级信息
     * @return 年级信息
     */
    @Override
    public List<GradeInfo> selectGradeInfoList(GradeInfo gradeInfo)
    {
        return gradeInfoMapper.selectGradeInfoList(gradeInfo);
    }

    /**
     * 新增年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    @Transactional
    @Override
    public int insertGradeInfo(GradeInfo gradeInfo)
    {
        int rows = gradeInfoMapper.insertGradeInfo(gradeInfo);
        insertCollegeInfo(gradeInfo);
        return rows;
    }

    /**
     * 修改年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    @Transactional
    @Override
    public int updateGradeInfo(GradeInfo gradeInfo)
    {
        gradeInfoMapper.deleteCollegeInfoByGradeId(gradeInfo.getGradeId());
        insertCollegeInfo(gradeInfo);
        return gradeInfoMapper.updateGradeInfo(gradeInfo);
    }

    /**
     * 批量删除年级信息
     * 
     * @param gradeIds 需要删除的年级信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteGradeInfoByGradeIds(Long[] gradeIds)
    {
        gradeInfoMapper.deleteCollegeInfoByGradeIds(gradeIds);
        return gradeInfoMapper.deleteGradeInfoByGradeIds(gradeIds);
    }

    /**
     * 删除年级信息信息
     * 
     * @param gradeId 年级信息主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteGradeInfoByGradeId(Long gradeId)
    {
        gradeInfoMapper.deleteCollegeInfoByGradeId(gradeId);
        return gradeInfoMapper.deleteGradeInfoByGradeId(gradeId);
    }

    /**
     * 新增学院信息信息
     * 
     * @param gradeInfo 年级信息对象
     */
    public void insertCollegeInfo(GradeInfo gradeInfo)
    {
        List<CollegeInfo> collegeInfoList = gradeInfo.getCollegeInfoList();
        Long gradeId = gradeInfo.getGradeId();
        if (StringUtils.isNotNull(collegeInfoList))
        {
            List<CollegeInfo> list = new ArrayList<CollegeInfo>();
            for (CollegeInfo collegeInfo : collegeInfoList)
            {
                collegeInfo.setGradeId(gradeId);
                list.add(collegeInfo);
            }
            if (list.size() > 0)
            {
                gradeInfoMapper.batchCollegeInfo(list);
            }
        }
    }
}

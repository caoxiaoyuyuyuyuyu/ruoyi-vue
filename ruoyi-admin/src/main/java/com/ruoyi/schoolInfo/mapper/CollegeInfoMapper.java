package com.ruoyi.schoolInfo.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.domain.CollegeInfo;
import com.ruoyi.schoolInfo.domain.MajorInfo;

/**
 * 学院信息Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface CollegeInfoMapper 
{
    /**
     * 查询学院信息
     * 
     * @param collegeId 学院信息主键
     * @return 学院信息
     */
    public CollegeInfo selectCollegeInfoByCollegeId(Long collegeId);

    /**
     * 查询学院信息列表
     * 
     * @param collegeInfo 学院信息
     * @return 学院信息集合
     */
    public List<CollegeInfo> selectCollegeInfoList(CollegeInfo collegeInfo);

    /**
     * 新增学院信息
     * 
     * @param collegeInfo 学院信息
     * @return 结果
     */
    public int insertCollegeInfo(CollegeInfo collegeInfo);

    /**
     * 修改学院信息
     * 
     * @param collegeInfo 学院信息
     * @return 结果
     */
    public int updateCollegeInfo(CollegeInfo collegeInfo);

    /**
     * 删除学院信息
     * 
     * @param collegeId 学院信息主键
     * @return 结果
     */
    public int deleteCollegeInfoByCollegeId(Long collegeId);

    /**
     * 批量删除学院信息
     * 
     * @param collegeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollegeInfoByCollegeIds(Long[] collegeIds);

    /**
     * 批量删除专业信息
     * 
     * @param collegeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMajorInfoByCollegeIds(Long[] collegeIds);
    
    /**
     * 批量新增专业信息
     * 
     * @param majorInfoList 专业信息列表
     * @return 结果
     */
    public int batchMajorInfo(List<MajorInfo> majorInfoList);
    

    /**
     * 通过学院信息主键删除专业信息信息
     * 
     * @param collegeId 学院信息ID
     * @return 结果
     */
    public int deleteMajorInfoByCollegeId(Long collegeId);
}

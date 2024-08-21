package com.ruoyi.schoolInfo.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.domain.GradeInfo;
import com.ruoyi.schoolInfo.domain.CollegeInfo;

/**
 * 年级信息Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface GradeInfoMapper 
{
    /**
     * 查询年级信息
     * 
     * @param gradeId 年级信息主键
     * @return 年级信息
     */
    public GradeInfo selectGradeInfoByGradeId(Long gradeId);

    /**
     * 查询年级信息列表
     * 
     * @param gradeInfo 年级信息
     * @return 年级信息集合
     */
    public List<GradeInfo> selectGradeInfoList(GradeInfo gradeInfo);

    /**
     * 新增年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    public int insertGradeInfo(GradeInfo gradeInfo);

    /**
     * 修改年级信息
     * 
     * @param gradeInfo 年级信息
     * @return 结果
     */
    public int updateGradeInfo(GradeInfo gradeInfo);

    /**
     * 删除年级信息
     * 
     * @param gradeId 年级信息主键
     * @return 结果
     */
    public int deleteGradeInfoByGradeId(Long gradeId);

    /**
     * 批量删除年级信息
     * 
     * @param gradeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGradeInfoByGradeIds(Long[] gradeIds);

    public List<Long> selectCollegeInfoByGradeIds(Long[] gradeIds);
    /**
     * 批量删除学院信息
     * 
     * @param gradeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollegeInfoByGradeIds(Long[] gradeIds);
    
    /**
     * 批量新增学院信息
     * 
     * @param collegeInfoList 学院信息列表
     * @return 结果
     */
    public int batchCollegeInfo(List<CollegeInfo> collegeInfoList);
    

    /**
     * 通过年级信息主键删除学院信息信息
     * 
     * @param gradeId 年级信息ID
     * @return 结果
     */
    public int deleteCollegeInfoByGradeId(Long gradeId);

}

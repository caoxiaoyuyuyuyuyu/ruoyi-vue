package com.ruoyi.schoolInfo.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.schoolInfo.domain.CampusInfo;
import com.ruoyi.schoolInfo.domain.GradeInfo;

/**
 * 学校信息Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface CampusInfoMapper 
{
    /**
     * 查询学校信息
     * 
     * @param campusId 学校信息主键
     * @return 学校信息
     */
    public CampusInfo selectCampusInfoByCampusId(Long campusId);

    /**
     * 查询学校信息列表
     * 
     * @param campusInfo 学校信息
     * @return 学校信息集合
     */
    public List<CampusInfo> selectCampusInfoList(CampusInfo campusInfo);

    /**
     * 新增学校信息
     * 
     * @param campusInfo 学校信息
     * @return 结果
     */
    public int insertCampusInfo(CampusInfo campusInfo);

    /**
     * 修改学校信息
     * 
     * @param campusInfo 学校信息
     * @return 结果
     */
    public int updateCampusInfo(CampusInfo campusInfo);

    /**
     * 删除学校信息
     * 
     * @param campusId 学校信息主键
     * @return 结果
     */
    public int deleteCampusInfoByCampusId(Long campusId);

    /**
     * 批量删除学校信息
     * 
     * @param campusIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCampusInfoByCampusIds(Long[] campusIds);

    /**
     * 批量删除年级信息
     * 
     * @param campusIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGradeInfoByCampusIds(Long[] campusIds);
    
    /**
     * 批量新增年级信息
     * 
     * @param gradeInfoList 年级信息列表
     * @return 结果
     */
    public int batchGradeInfo(List<GradeInfo> gradeInfoList);
    

    /**
     * 通过学校信息主键删除年级信息信息
     * 
     * @param campusId 学校信息ID
     * @return 结果
     */
    public int deleteGradeInfoByCampusId(Long campusId);
}

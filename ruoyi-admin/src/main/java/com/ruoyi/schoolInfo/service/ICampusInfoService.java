package com.ruoyi.schoolInfo.service;

import java.util.List;
import com.ruoyi.schoolInfo.domain.CampusInfo;

/**
 * 学校信息Service接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public interface ICampusInfoService 
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
     * 批量删除学校信息
     * 
     * @param campusIds 需要删除的学校信息主键集合
     * @return 结果
     */
    public int deleteCampusInfoByCampusIds(Long[] campusIds);

    /**
     * 删除学校信息信息
     * 
     * @param campusId 学校信息主键
     * @return 结果
     */
    public int deleteCampusInfoByCampusId(Long campusId);
}

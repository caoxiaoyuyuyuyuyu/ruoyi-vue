package com.ruoyi.schoolInfo.mapper;

import java.util.List;
import com.ruoyi.schoolInfo.domain.BuildingInfo;

/**
 * 宿舍信息Mapper接口
 *
 * @author xiaoyu
 * @date 2024-08-16
 */
public interface BuildingInfoMapper
{
    /**
     * 查询宿舍信息
     *
     * @param buildingId 宿舍信息主键
     * @return 宿舍信息
     */
    public BuildingInfo selectBuildingInfoByBuildingId(Long buildingId);

    /**
     * 查询宿舍信息列表
     *
     * @param buildingInfo 宿舍信息
     * @return 宿舍信息集合
     */
    public List<BuildingInfo> selectBuildingInfoList(BuildingInfo buildingInfo);

    /**
     * 新增宿舍信息
     *
     * @param buildingInfo 宿舍信息
     * @return 结果
     */
    public int insertBuildingInfo(BuildingInfo buildingInfo);

    /**
     * 修改宿舍信息
     *
     * @param buildingInfo 宿舍信息
     * @return 结果
     */
    public int updateBuildingInfo(BuildingInfo buildingInfo);

    /**
     * 删除宿舍信息
     *
     * @param buildingId 宿舍信息主键
     * @return 结果
     */
    public int deleteBuildingInfoByBuildingId(Long buildingId);

    /**
     * 批量删除宿舍信息
     *
     * @param buildingIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBuildingInfoByBuildingIds(Long[] buildingIds);
}

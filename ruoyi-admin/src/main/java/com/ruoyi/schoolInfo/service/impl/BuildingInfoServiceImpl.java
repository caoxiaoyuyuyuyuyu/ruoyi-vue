package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.schoolInfo.mapper.BuildingInfoMapper;
import com.ruoyi.schoolInfo.domain.BuildingInfo;
import com.ruoyi.schoolInfo.service.IBuildingInfoService;

/**
 * 宿舍信息Service业务层处理
 *
 * @author xiaoyu
 * @date 2024-08-16
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class BuildingInfoServiceImpl implements IBuildingInfoService
{
    @Autowired
    private BuildingInfoMapper buildingInfoMapper;

    /**
     * 查询宿舍信息
     *
     * @param buildingId 宿舍信息主键
     * @return 宿舍信息
     */
    @Override
    public BuildingInfo selectBuildingInfoByBuildingId(Long buildingId)
    {
        return buildingInfoMapper.selectBuildingInfoByBuildingId(buildingId);
    }

    /**
     * 查询宿舍信息列表
     *
     * @param buildingInfo 宿舍信息
     * @return 宿舍信息
     */
    @Override
    public List<BuildingInfo> selectBuildingInfoList(BuildingInfo buildingInfo)
    {
        return buildingInfoMapper.selectBuildingInfoList(buildingInfo);
    }

    /**
     * 新增宿舍信息
     *
     * @param buildingInfo 宿舍信息
     * @return 结果
     */
    @Override
    public int insertBuildingInfo(BuildingInfo buildingInfo)
    {
        return buildingInfoMapper.insertBuildingInfo(buildingInfo);
    }

    /**
     * 修改宿舍信息
     *
     * @param buildingInfo 宿舍信息
     * @return 结果
     */
    @Override
    public int updateBuildingInfo(BuildingInfo buildingInfo)
    {
        return buildingInfoMapper.updateBuildingInfo(buildingInfo);
    }

    /**
     * 批量删除宿舍信息
     *
     * @param buildingIds 需要删除的宿舍信息主键
     * @return 结果
     */
    @Override
    public int deleteBuildingInfoByBuildingIds(Long[] buildingIds)
    {
        return buildingInfoMapper.deleteBuildingInfoByBuildingIds(buildingIds);
    }

    /**
     * 删除宿舍信息信息
     *
     * @param buildingId 宿舍信息主键
     * @return 结果
     */
    @Override
    public int deleteBuildingInfoByBuildingId(Long buildingId)
    {
        return buildingInfoMapper.deleteBuildingInfoByBuildingId(buildingId);
    }
}

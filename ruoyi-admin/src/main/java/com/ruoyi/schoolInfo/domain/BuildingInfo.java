package com.ruoyi.schoolInfo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 宿舍信息对象 building_info
 *
 * @author xiaoyu
 * @date 2024-08-16
 */
public class BuildingInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 宿舍楼编号 */
    @Excel(name = "宿舍楼编号")
    private Long buildingId;

    /** 楼名 */
    @Excel(name = "楼名")
    private String buildingName;

    /** 楼层数 */
    @Excel(name = "楼层数")
    private Long floorNum;

    /** 单层宿舍数量 */
    @Excel(name = "单层宿舍数量")
    private Long dormitoryNum;

    /** 校区编号 */
    @Excel(name = "校区编号")
    private Long campusId;

    public void setBuildingId(Long buildingId)
    {
        this.buildingId = buildingId;
    }

    public Long getBuildingId()
    {
        return buildingId;
    }
    public void setBuildingName(String buildingName)
    {
        this.buildingName = buildingName;
    }

    public String getBuildingName()
    {
        return buildingName;
    }
    public void setFloorNum(Long floorNum)
    {
        this.floorNum = floorNum;
    }

    public Long getFloorNum()
    {
        return floorNum;
    }
    public void setDormitoryNum(Long dormitoryNum)
    {
        this.dormitoryNum = dormitoryNum;
    }

    public Long getDormitoryNum()
    {
        return dormitoryNum;
    }
    public void setCampusId(Long campusId)
    {
        this.campusId = campusId;
    }

    public Long getCampusId()
    {
        return campusId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("buildingId", getBuildingId())
                .append("buildingName", getBuildingName())
                .append("floorNum", getFloorNum())
                .append("dormitoryNum", getDormitoryNum())
                .append("campusId", getCampusId())
                .toString();
    }
}

package com.ruoyi.schoolInfo.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学校信息对象 campus_info
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class CampusInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 校区编号 */
    @Excel(name = "校区编号")
    private Long campusId;

    /** 校区名称 */
    @Excel(name = "校区名称")
    private String campusName;

    /** 年级信息信息 */
    private List<GradeInfo> gradeInfoList;

    public void setCampusId(Long campusId) 
    {
        this.campusId = campusId;
    }

    public Long getCampusId() 
    {
        return campusId;
    }
    public void setCampusName(String campusName) 
    {
        this.campusName = campusName;
    }

    public String getCampusName() 
    {
        return campusName;
    }

    public List<GradeInfo> getGradeInfoList()
    {
        return gradeInfoList;
    }

    public void setGradeInfoList(List<GradeInfo> gradeInfoList)
    {
        this.gradeInfoList = gradeInfoList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("campusId", getCampusId())
            .append("campusName", getCampusName())
            .append("gradeInfoList", getGradeInfoList())
            .toString();
    }
}

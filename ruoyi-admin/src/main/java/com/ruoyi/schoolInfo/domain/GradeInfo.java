package com.ruoyi.schoolInfo.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 年级信息对象 grade_info
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class GradeInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 年级编号 */
    @Excel(name = "年级编号")
    private Long gradeId;

    /** 年级名称 */
    @Excel(name = "年级名称")
    private String gradeName;

    /** 校区编号 */
    @Excel(name = "校区编号")
    private Long campusId;

    /** 学院信息信息 */
    private List<CollegeInfo> collegeInfoList;

    public void setGradeId(Long gradeId) 
    {
        this.gradeId = gradeId;
    }

    public Long getGradeId() 
    {
        return gradeId;
    }
    public void setGradeName(String gradeName) 
    {
        this.gradeName = gradeName;
    }

    public String getGradeName() 
    {
        return gradeName;
    }
    public void setCampusId(Long campusId) 
    {
        this.campusId = campusId;
    }

    public Long getCampusId() 
    {
        return campusId;
    }

    public List<CollegeInfo> getCollegeInfoList()
    {
        return collegeInfoList;
    }

    public void setCollegeInfoList(List<CollegeInfo> collegeInfoList)
    {
        this.collegeInfoList = collegeInfoList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("gradeId", getGradeId())
            .append("gradeName", getGradeName())
            .append("campusId", getCampusId())
            .append("collegeInfoList", getCollegeInfoList())
            .toString();
    }
}

package com.ruoyi.schoolInfo.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学院信息对象 college_info
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class CollegeInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学院编号 */
    @Excel(name = "学院编号")
    private Long collegeId;

    /** 学院名称 */
    @Excel(name = "学院名称")
    private String collegeName;

    /** 年级编号 */
    @Excel(name = "年级编号")
    private Long gradeId;

    /** 专业信息信息 */
    private List<MajorInfo> majorInfoList;

    public void setCollegeId(Long collegeId) 
    {
        this.collegeId = collegeId;
    }

    public Long getCollegeId() 
    {
        return collegeId;
    }
    public void setCollegeName(String collegeName) 
    {
        this.collegeName = collegeName;
    }

    public String getCollegeName() 
    {
        return collegeName;
    }
    public void setGradeId(Long gradeId) 
    {
        this.gradeId = gradeId;
    }

    public Long getGradeId() 
    {
        return gradeId;
    }

    public List<MajorInfo> getMajorInfoList()
    {
        return majorInfoList;
    }

    public void setMajorInfoList(List<MajorInfo> majorInfoList)
    {
        this.majorInfoList = majorInfoList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collegeId", getCollegeId())
            .append("collegeName", getCollegeName())
            .append("gradeId", getGradeId())
            .append("majorInfoList", getMajorInfoList())
            .toString();
    }
}

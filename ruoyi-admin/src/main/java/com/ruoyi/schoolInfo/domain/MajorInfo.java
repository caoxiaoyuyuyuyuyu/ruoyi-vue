package com.ruoyi.schoolInfo.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 专业信息对象 major_info
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class MajorInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 专业编号 */
    @Excel(name = "专业编号")
    private Long majorId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String majorName;

    /** 学院编号 */
    @Excel(name = "学院编号")
    private Long collegeId;

    /** 班级信息信息 */
    private List<ClassInfo> classInfoList;

    public void setMajorId(Long majorId) 
    {
        this.majorId = majorId;
    }

    public Long getMajorId() 
    {
        return majorId;
    }
    public void setMajorName(String majorName) 
    {
        this.majorName = majorName;
    }

    public String getMajorName() 
    {
        return majorName;
    }
    public void setCollegeId(Long collegeId) 
    {
        this.collegeId = collegeId;
    }

    public Long getCollegeId() 
    {
        return collegeId;
    }

    public List<ClassInfo> getClassInfoList()
    {
        return classInfoList;
    }

    public void setClassInfoList(List<ClassInfo> classInfoList)
    {
        this.classInfoList = classInfoList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("majorId", getMajorId())
            .append("majorName", getMajorName())
            .append("collegeId", getCollegeId())
            .append("classInfoList", getClassInfoList())
            .toString();
    }
}

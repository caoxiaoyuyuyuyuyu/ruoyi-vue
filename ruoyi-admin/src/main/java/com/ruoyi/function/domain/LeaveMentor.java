package com.ruoyi.function.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * leave_mentor对象 leave_mentor
 *
 * @author xiaou
 * @date 2024-09-15
 */
public class LeaveMentor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 请假条id */
    @Excel(name = "请假条id")
    private Long postId;

    /** 学号 */
    @Excel(name = "学号")
    private String userId;

    /** 教师工号 */
    @Excel(name = "教师工号")
    private String mentorId;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String courseSTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String courseETime;

    /** 提交时间 */
    @Excel(name = "提交时间", width = 30)
    private String createdAt;

    /** 审核时间 */
    @Excel(name = "审核时间", width = 30)
    private String updatedAt;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String status;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setPostId(Long postId)
    {
        this.postId = postId;
    }

    public Long getPostId()
    {
        return postId;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }
    public void setMentorId(String mentorId)
    {
        this.mentorId = mentorId;
    }

    public String getMentorId()
    {
        return mentorId;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }
    public void setCourseSTime(String courseSTime)
    {
        this.courseSTime = courseSTime;
    }

    public String getCourseSTime()
    {
        return courseSTime;
    }
    public void setCourseETime(String courseETime)
    {
        this.courseETime = courseETime;
    }

    public String getCourseETime()
    {
        return courseETime;
    }
    public void setCreatedAt(String createdAt)
    {
        this.createdAt = createdAt;
    }

    public String getCreatedAt()
    {
        return createdAt;
    }
    public void setUpdatedAt(String updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt()
    {
        return updatedAt;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("postId", getPostId())
                .append("userId", getUserId())
                .append("mentorId", getMentorId())
                .append("courseName", getCourseName())
                .append("courseSTime", getCourseSTime())
                .append("courseETime", getCourseETime())
                .append("createdAt", getCreatedAt())
                .append("updatedAt", getUpdatedAt())
                .append("status", getStatus())
                .toString();
    }
}

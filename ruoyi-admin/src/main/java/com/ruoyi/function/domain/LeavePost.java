package com.ruoyi.function.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * leave_post对象 leave_post
 * 
 * @author xiaou
 * @date 2024-09-15
 */
public class LeavePost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 学号 */
    @Excel(name = "学号")
    private String userId;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String trueName;

    /** 是否离校 */
    @Excel(name = "是否离校")
    private String isOut;

    /** 请假原因 */
    @Excel(name = "请假原因")
    private String reason;

    /** 附件 */
    @Excel(name = "附件")
    private String file;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 审核人 */
    @Excel(name = "审核人")
    private String reviewerId;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String status;

    /** 提交时间 */
    //有具体时间点
    @Excel(name = "提交时间", width = 30)
    private String createdAt;

    /** 状态更新时间 */
    @Excel(name = "提交时间", width = 30)
    private String updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }
    public void setTrueName(String trueName) 
    {
        this.trueName = trueName;
    }

    public String getTrueName() 
    {
        return trueName;
    }
    public void setIsOut(String isOut) 
    {
        this.isOut = isOut;
    }

    public String getIsOut() 
    {
        return isOut;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setFile(String file) 
    {
        this.file = file;
    }

    public String getFile() 
    {
        return file;
    }
    public void setStartTime(String startTime) 
    {
        this.startTime = startTime;
    }

    public String getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }
    public void setReviewerId(String reviewerId) 
    {
        this.reviewerId = reviewerId;
    }

    public String getReviewerId() 
    {
        return reviewerId;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("trueName", getTrueName())
            .append("isOut", getIsOut())
            .append("reason", getReason())
            .append("file", getFile())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("reviewerId", getReviewerId())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}

package com.ruoyi.function.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 问卷作答统计对象 answer_statistics
 * 
 * @author xiaou
 * @date 2024-08-22
 */
public class QuesAnswerStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 问卷id */
    @Excel(name = "问卷id")
    private Long naireId;

    /** 问题id */
    @Excel(name = "问题id")
    private Long questionId;

    /** 问题类型 */
    @Excel(name = "问题类型")
    private String answerType;

    /** 选项对应数量 */
    @Excel(name = "选项对应数量")
    private String choiceCount;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    /** 最近更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNaireId(Long naireId) 
    {
        this.naireId = naireId;
    }

    public Long getNaireId() 
    {
        return naireId;
    }
    public void setQuestionId(Long questionId) 
    {
        this.questionId = questionId;
    }

    public Long getQuestionId() 
    {
        return questionId;
    }
    public void setAnswerType(String answerType) 
    {
        this.answerType = answerType;
    }

    public String getAnswerType() 
    {
        return answerType;
    }
    public void setChoiceCount(String choiceCount) 
    {
        this.choiceCount = choiceCount;
    }

    public String getChoiceCount() 
    {
        return choiceCount;
    }
    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt) 
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt() 
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("naireId", getNaireId())
            .append("questionId", getQuestionId())
            .append("answerType", getAnswerType())
            .append("choiceCount", getChoiceCount())
            .append("createdAt", getCreatedAt())
            .append("updatedAt", getUpdatedAt())
            .toString();
    }
}

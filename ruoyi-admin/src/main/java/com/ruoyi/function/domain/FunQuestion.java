package com.ruoyi.function.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 问卷中的问题对象 question
 * 
 * @author xiaou
 * @date 2024-08-21
 */
public class FunQuestion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 问题类型，多选单选等 */
    @Excel(name = "问题类型，多选单选等")
    private String type;

    /** 问题名称 */
    @Excel(name = "问题名称")
    private String name;

    /** 问题描述 */
    @Excel(name = "问题描述")
    private String description;

    /** 详细 */
    @Excel(name = "详细")
    private String content;

    /** 问题所属问卷的id */
    @Excel(name = "问题所属问卷的id")
    private Long questionnaireId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setQuestionnaireId(Long questionnaireId) 
    {
        this.questionnaireId = questionnaireId;
    }

    public Long getQuestionnaireId() 
    {
        return questionnaireId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("type", getType())
            .append("name", getName())
            .append("description", getDescription())
            .append("content", getContent())
            .append("questionnaireId", getQuestionnaireId())
            .toString();
    }
}

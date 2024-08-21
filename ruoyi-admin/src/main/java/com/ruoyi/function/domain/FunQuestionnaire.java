package com.ruoyi.function.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 问卷对象 questionnaire
 * 
 * @author xiaou
 * @date 2024-08-21
 */
public class FunQuestionnaire extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 匿名选项 */
    @Excel(name = "匿名选项")
    private String anonymous;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 问卷描述 */
    @Excel(name = "问卷描述")
    private String description;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String startTime;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime;

    /** 问卷中的问题信息 */
    private List<FunQuestion> funQuestionList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAnonymous(String anonymous) 
    {
        this.anonymous = anonymous;
    }

    public String getAnonymous() 
    {
        return anonymous;
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

    public List<FunQuestion> getFunQuestionList()
    {
        return funQuestionList;
    }

    public void setFunQuestionList(List<FunQuestion> funQuestionList)
    {
        this.funQuestionList = funQuestionList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("anonymous", getAnonymous())
            .append("type", getType())
            .append("name", getName())
            .append("description", getDescription())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("funQuestionList", getFunQuestionList())
            .toString();
    }
}

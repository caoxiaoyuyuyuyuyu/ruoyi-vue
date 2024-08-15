package com.ruoyi.function.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 投诉与建议对象 advise
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class FunAdvise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 学号 */
    @Excel(name = "学号")
    private String stuId;

    /** 描述 */
    @Excel(name = "描述")
    private String describes;

    /** 类型 */
    @Excel(name = "类型")
    private String category;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contactobject;

    /** 发送时间 */
    @Excel(name = "发送时间")
    private String pushtime;

    /** 文件 */
    @Excel(name = "文件")
    private String path;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStuId(String stuId) 
    {
        this.stuId = stuId;
    }

    public String getStuId() 
    {
        return stuId;
    }
    public void setDescribes(String describes) 
    {
        this.describes = describes;
    }

    public String getDescribes() 
    {
        return describes;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setContactobject(String contactobject) 
    {
        this.contactobject = contactobject;
    }

    public String getContactobject() 
    {
        return contactobject;
    }
    public void setPushtime(String pushtime) 
    {
        this.pushtime = pushtime;
    }

    public String getPushtime() 
    {
        return pushtime;
    }
    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuId", getStuId())
            .append("describes", getDescribes())
            .append("category", getCategory())
            .append("contactobject", getContactobject())
            .append("pushtime", getPushtime())
            .append("path", getPath())
            .append("status", getStatus())
            .toString();
    }
}

package com.ruoyi.function.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生信息对象 user
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public class FunUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** openid */
    @Excel(name = "openid", type = Excel.Type.EXPORT)
    private String openid;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 密码 */
    private String password;

    /** 姓名 */
    @Excel(name = "姓名")
    private String trueName;

    /** 学号 */
    @Excel(name = "学号")
    private String userid;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 头像 */
    @Excel(name = "头像", type = Excel.Type.EXPORT)
    private String avatarUrl;

    /** 权限等级 */
    @Excel(name = "权限等级", readConverterExp = "2=学生，1=教师，0=管理员")
    private String userLevel;

    /** 宿舍 */
    @Excel(name = "宿舍")
    private String dormitory;

    /** 班级id */
    private Long classId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOpenid(String openid) 
    {
        this.openid = openid;
    }

    public String getOpenid() 
    {
        return openid;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setTrueName(String trueName) 
    {
        this.trueName = trueName;
    }

    public String getTrueName() 
    {
        return trueName;
    }
    public void setUserid(String userid) 
    {
        this.userid = userid;
    }

    public String getUserid() 
    {
        return userid;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAvatarUrl(String avatarUrl) 
    {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() 
    {
        return avatarUrl;
    }
    public void setUserLevel(String userLevel) 
    {
        this.userLevel = userLevel;
    }

    public String getUserLevel() 
    {
        return userLevel;
    }
    public void setDormitory(String dormitory) 
    {
        this.dormitory = dormitory;
    }

    public String getDormitory() 
    {
        return dormitory;
    }
    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("openid", getOpenid())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("trueName", getTrueName())
            .append("userid", getUserid())
            .append("phone", getPhone())
            .append("avatarUrl", getAvatarUrl())
            .append("userLevel", getUserLevel())
            .append("dormitory", getDormitory())
            .append("classId", getClassId())
            .toString();
    }
}

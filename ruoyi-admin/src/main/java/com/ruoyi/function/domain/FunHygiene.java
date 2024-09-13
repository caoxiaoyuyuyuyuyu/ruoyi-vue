package com.ruoyi.function.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 卫检成绩对象 hygiene_info
 * 
 * @author xiaou
 * @date 2024-09-13
 */
public class FunHygiene extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 宿舍 */
    @Excel(name = "宿舍")
    private String dormitoryId;

    /** 第一周成绩 */
    @Excel(name = "第一周成绩")
    private String firstRank;

    /** 第二周成绩 */
    @Excel(name = "第二周成绩")
    private String secondRank;

    /** 第三周成绩 */
    @Excel(name = "第三周成绩")
    private String thirdRank;

    /** 第四周成绩 */
    @Excel(name = "第四周成绩")
    private String fourthRank;

    /** 第五周成绩 */
    @Excel(name = "第五周成绩")
    private String fifthRank;

    /** 第六周成绩 */
    @Excel(name = "第六周成绩")
    private String sixthRank;

    /** 第七周成绩 */
    @Excel(name = "第七周成绩")
    private String seventhRank;

    /** 第八周成绩 */
    @Excel(name = "第八周成绩")
    private String eighthRank;

    /** 第九周成绩 */
    @Excel(name = "第九周成绩")
    private String ninthRank;

    /** 第十周成绩 */
    @Excel(name = "第十周成绩")
    private String tenthRank;

    /** 第十一周成绩 */
    @Excel(name = "第十一周成绩")
    private String eleventhRank;

    /** 第十二周成绩 */
    @Excel(name = "第十二周成绩")
    private String twelfthRank;

    /** 第十三周成绩 */
    @Excel(name = "第十三周成绩")
    private String thirteenthRank;

    /** 第十四周成绩 */
    @Excel(name = "第十四周成绩")
    private String fourteenthRank;

    /** 第十五周成绩 */
    @Excel(name = "第十五周成绩")
    private String fifteenthRank;

    /** 第十六周成绩 */
    @Excel(name = "第十六周成绩")
    private String sixteenthRank;

    /** 第十七周成绩 */
    @Excel(name = "第十七周成绩")
    private String seventeenthRank;

    /** 第十八周成绩 */
    @Excel(name = "第十八周成绩")
    private String eighteenthRank;

    /** 第十九周成绩 */
    @Excel(name = "第十九周成绩")
    private String nineteenthRank;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDormitoryId(String dormitoryId) 
    {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryId() 
    {
        return dormitoryId;
    }
    public void setFirstRank(String firstRank) 
    {
        this.firstRank = firstRank;
    }

    public String getFirstRank() 
    {
        return firstRank;
    }
    public void setSecondRank(String secondRank) 
    {
        this.secondRank = secondRank;
    }

    public String getSecondRank() 
    {
        return secondRank;
    }
    public void setThirdRank(String thirdRank) 
    {
        this.thirdRank = thirdRank;
    }

    public String getThirdRank() 
    {
        return thirdRank;
    }
    public void setFourthRank(String fourthRank) 
    {
        this.fourthRank = fourthRank;
    }

    public String getFourthRank() 
    {
        return fourthRank;
    }
    public void setFifthRank(String fifthRank) 
    {
        this.fifthRank = fifthRank;
    }

    public String getFifthRank() 
    {
        return fifthRank;
    }
    public void setSixthRank(String sixthRank) 
    {
        this.sixthRank = sixthRank;
    }

    public String getSixthRank() 
    {
        return sixthRank;
    }
    public void setSeventhRank(String seventhRank) 
    {
        this.seventhRank = seventhRank;
    }

    public String getSeventhRank() 
    {
        return seventhRank;
    }
    public void setEighthRank(String eighthRank) 
    {
        this.eighthRank = eighthRank;
    }

    public String getEighthRank() 
    {
        return eighthRank;
    }
    public void setNinthRank(String ninthRank) 
    {
        this.ninthRank = ninthRank;
    }

    public String getNinthRank() 
    {
        return ninthRank;
    }
    public void setTenthRank(String tenthRank) 
    {
        this.tenthRank = tenthRank;
    }

    public String getTenthRank() 
    {
        return tenthRank;
    }
    public void setEleventhRank(String eleventhRank) 
    {
        this.eleventhRank = eleventhRank;
    }

    public String getEleventhRank() 
    {
        return eleventhRank;
    }
    public void setTwelfthRank(String twelfthRank) 
    {
        this.twelfthRank = twelfthRank;
    }

    public String getTwelfthRank() 
    {
        return twelfthRank;
    }
    public void setThirteenthRank(String thirteenthRank) 
    {
        this.thirteenthRank = thirteenthRank;
    }

    public String getThirteenthRank() 
    {
        return thirteenthRank;
    }
    public void setFourteenthRank(String fourteenthRank) 
    {
        this.fourteenthRank = fourteenthRank;
    }

    public String getFourteenthRank() 
    {
        return fourteenthRank;
    }
    public void setFifteenthRank(String fifteenthRank) 
    {
        this.fifteenthRank = fifteenthRank;
    }

    public String getFifteenthRank() 
    {
        return fifteenthRank;
    }
    public void setSixteenthRank(String sixteenthRank) 
    {
        this.sixteenthRank = sixteenthRank;
    }

    public String getSixteenthRank() 
    {
        return sixteenthRank;
    }
    public void setSeventeenthRank(String seventeenthRank) 
    {
        this.seventeenthRank = seventeenthRank;
    }

    public String getSeventeenthRank() 
    {
        return seventeenthRank;
    }
    public void setEighteenthRank(String eighteenthRank) 
    {
        this.eighteenthRank = eighteenthRank;
    }

    public String getEighteenthRank() 
    {
        return eighteenthRank;
    }
    public void setNineteenthRank(String nineteenthRank) 
    {
        this.nineteenthRank = nineteenthRank;
    }

    public String getNineteenthRank() 
    {
        return nineteenthRank;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dormitoryId", getDormitoryId())
            .append("firstRank", getFirstRank())
            .append("secondRank", getSecondRank())
            .append("thirdRank", getThirdRank())
            .append("fourthRank", getFourthRank())
            .append("fifthRank", getFifthRank())
            .append("sixthRank", getSixthRank())
            .append("seventhRank", getSeventhRank())
            .append("eighthRank", getEighthRank())
            .append("ninthRank", getNinthRank())
            .append("tenthRank", getTenthRank())
            .append("eleventhRank", getEleventhRank())
            .append("twelfthRank", getTwelfthRank())
            .append("thirteenthRank", getThirteenthRank())
            .append("fourteenthRank", getFourteenthRank())
            .append("fifteenthRank", getFifteenthRank())
            .append("sixteenthRank", getSixteenthRank())
            .append("seventeenthRank", getSeventeenthRank())
            .append("eighteenthRank", getEighteenthRank())
            .append("nineteenthRank", getNineteenthRank())
            .toString();
    }
}

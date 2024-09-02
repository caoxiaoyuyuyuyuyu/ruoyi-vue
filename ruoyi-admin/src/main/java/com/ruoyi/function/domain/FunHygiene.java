package com.ruoyi.function.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 卫检成绩对象 hygiene
 * 
 * @author zhenzhen
 * @date 2024-08-28
 */
public class FunHygiene extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 宿舍 */
    @Excel(name = "宿舍")
    private String Dormitoryid;

    /** 第一周成绩 */
    @Excel(name = "第一周成绩")
    private String FirstRank;

    /** 第二周成绩 */
    @Excel(name = "第二周成绩")
    private String SecondRank;

    /** 第三周成绩 */
    @Excel(name = "第三周成绩")
    private String ThirdRank;

    /** 第四周成绩 */
    @Excel(name = "第四周成绩")
    private String FourthRank;

    /** 第五周成绩 */
    @Excel(name = "第五周成绩")
    private String FifthRank;

    /** 第六周成绩 */
    @Excel(name = "第六周成绩")
    private String SixthRank;

    /** 第七周成绩 */
    @Excel(name = "第七周成绩")
    private String SeventhRank;

    /** 第八周成绩 */
    @Excel(name = "第八周成绩")
    private String EighthRank;

    /** 第九周成绩 */
    @Excel(name = "第九周成绩")
    private String NinthRank;

    /** 第十周成绩 */
    @Excel(name = "第十周成绩")
    private String TenthRank;

    /** 第十一周成绩 */
    @Excel(name = "第十一周成绩")
    private String EleventhRank;

    /** 第十二周成绩 */
    @Excel(name = "第十二周成绩")
    private String TwelfthRank;

    /** 第十三周成绩 */
    @Excel(name = "第十三周成绩")
    private String ThirteenthRank;

    /** 第十四周成绩 */
    @Excel(name = "第十四周成绩")
    private String FourteenthRank;

    /** 第十五周成绩 */
    @Excel(name = "第十五周成绩")
    private String FifteenthRank;

    /** 第十六周成绩 */
    @Excel(name = "第十六周成绩")
    private String SixteenthRank;

    /** 第十七周成绩 */
    @Excel(name = "第十七周成绩")
    private String SeventeenthRank;

    /** 第十八周成绩 */
    @Excel(name = "第十八周成绩")
    private String EighteenthRank;

    /** 第十九周成绩 */
    @Excel(name = "第十九周成绩")
    private String NineteenthRank;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDormitoryid(String Dormitoryid) 
    {
        this.Dormitoryid = Dormitoryid;
    }

    public String getDormitoryid() 
    {
        return Dormitoryid;
    }
    public void setFirstRank(String FirstRank) 
    {
        this.FirstRank = FirstRank;
    }

    public String getFirstRank() 
    {
        return FirstRank;
    }
    public void setSecondRank(String SecondRank) 
    {
        this.SecondRank = SecondRank;
    }

    public String getSecondRank() 
    {
        return SecondRank;
    }
    public void setThirdRank(String ThirdRank) 
    {
        this.ThirdRank = ThirdRank;
    }

    public String getThirdRank() 
    {
        return ThirdRank;
    }
    public void setFourthRank(String FourthRank) 
    {
        this.FourthRank = FourthRank;
    }

    public String getFourthRank() 
    {
        return FourthRank;
    }
    public void setFifthRank(String FifthRank) 
    {
        this.FifthRank = FifthRank;
    }

    public String getFifthRank() 
    {
        return FifthRank;
    }
    public void setSixthRank(String SixthRank) 
    {
        this.SixthRank = SixthRank;
    }

    public String getSixthRank() 
    {
        return SixthRank;
    }
    public void setSeventhRank(String SeventhRank) 
    {
        this.SeventhRank = SeventhRank;
    }

    public String getSeventhRank() 
    {
        return SeventhRank;
    }
    public void setEighthRank(String EighthRank) 
    {
        this.EighthRank = EighthRank;
    }

    public String getEighthRank() 
    {
        return EighthRank;
    }
    public void setNinthRank(String NinthRank) 
    {
        this.NinthRank = NinthRank;
    }

    public String getNinthRank() 
    {
        return NinthRank;
    }
    public void setTenthRank(String TenthRank) 
    {
        this.TenthRank = TenthRank;
    }

    public String getTenthRank() 
    {
        return TenthRank;
    }
    public void setEleventhRank(String EleventhRank) 
    {
        this.EleventhRank = EleventhRank;
    }

    public String getEleventhRank() 
    {
        return EleventhRank;
    }
    public void setTwelfthRank(String TwelfthRank) 
    {
        this.TwelfthRank = TwelfthRank;
    }

    public String getTwelfthRank() 
    {
        return TwelfthRank;
    }
    public void setThirteenthRank(String ThirteenthRank) 
    {
        this.ThirteenthRank = ThirteenthRank;
    }

    public String getThirteenthRank() 
    {
        return ThirteenthRank;
    }
    public void setFourteenthRank(String FourteenthRank) 
    {
        this.FourteenthRank = FourteenthRank;
    }

    public String getFourteenthRank() 
    {
        return FourteenthRank;
    }
    public void setFifteenthRank(String FifteenthRank) 
    {
        this.FifteenthRank = FifteenthRank;
    }

    public String getFifteenthRank() 
    {
        return FifteenthRank;
    }
    public void setSixteenthRank(String SixteenthRank) 
    {
        this.SixteenthRank = SixteenthRank;
    }

    public String getSixteenthRank() 
    {
        return SixteenthRank;
    }
    public void setSeventeenthRank(String SeventeenthRank) 
    {
        this.SeventeenthRank = SeventeenthRank;
    }

    public String getSeventeenthRank() 
    {
        return SeventeenthRank;
    }
    public void setEighteenthRank(String EighteenthRank) 
    {
        this.EighteenthRank = EighteenthRank;
    }

    public String getEighteenthRank() 
    {
        return EighteenthRank;
    }
    public void setNineteenthRank(String NineteenthRank) 
    {
        this.NineteenthRank = NineteenthRank;
    }

    public String getNineteenthRank() 
    {
        return NineteenthRank;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("Dormitoryid", getDormitoryid())
            .append("FirstRank", getFirstRank())
            .append("SecondRank", getSecondRank())
            .append("ThirdRank", getThirdRank())
            .append("FourthRank", getFourthRank())
            .append("FifthRank", getFifthRank())
            .append("SixthRank", getSixthRank())
            .append("SeventhRank", getSeventhRank())
            .append("EighthRank", getEighthRank())
            .append("NinthRank", getNinthRank())
            .append("TenthRank", getTenthRank())
            .append("EleventhRank", getEleventhRank())
            .append("TwelfthRank", getTwelfthRank())
            .append("ThirteenthRank", getThirteenthRank())
            .append("FourteenthRank", getFourteenthRank())
            .append("FifteenthRank", getFifteenthRank())
            .append("SixteenthRank", getSixteenthRank())
            .append("SeventeenthRank", getSeventeenthRank())
            .append("EighteenthRank", getEighteenthRank())
            .append("NineteenthRank", getNineteenthRank())
            .toString();
    }
}

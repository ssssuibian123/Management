package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 离职界面对象 onboarding
 * 
 * @author aower
 * @date 2022-02-17
 */
public class outboarding extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 离职表编号 */
    private Long onboardingId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String onboardingName;

    /** 照片 */
    @Excel(name = "照片")
    private String onboardingPicture;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 职位 */
    @Excel(name = "职位")
    private String onboardingPosition;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long onboardingAge;

    /** 星座 */
    @Excel(name = "星座")
    private String onboardingConstellation;

    /** 学历 */
    @Excel(name = "学历")
    private String onboardingEducation;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private Integer onboardingMarrige;

    /** 证书 */
    @Excel(name = "证书")
    private String onboardingCertificate;

    /** 级别 */
    @Excel(name = "级别")
    private Long onboardingLeve;

    public void setOnboardingId(Long onboardingId) 
    {
        this.onboardingId = onboardingId;
    }

    public Long getOnboardingId() 
    {
        return onboardingId;
    }
    public void setOnboardingName(String onboardingName) 
    {
        this.onboardingName = onboardingName;
    }

    public String getOnboardingName() 
    {
        return onboardingName;
    }
    public void setOnboardingPicture(String onboardingPicture) 
    {
        this.onboardingPicture = onboardingPicture;
    }

    public String getOnboardingPicture() 
    {
        return onboardingPicture;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setOnboardingPosition(String onboardingPosition) 
    {
        this.onboardingPosition = onboardingPosition;
    }

    public String getOnboardingPosition() 
    {
        return onboardingPosition;
    }
    public void setOnboardingAge(Long onboardingAge) 
    {
        this.onboardingAge = onboardingAge;
    }

    public Long getOnboardingAge() 
    {
        return onboardingAge;
    }
    public void setOnboardingConstellation(String onboardingConstellation) 
    {
        this.onboardingConstellation = onboardingConstellation;
    }

    public String getOnboardingConstellation() 
    {
        return onboardingConstellation;
    }
    public void setOnboardingEducation(String onboardingEducation) 
    {
        this.onboardingEducation = onboardingEducation;
    }

    public String getOnboardingEducation() 
    {
        return onboardingEducation;
    }
    public void setOnboardingMarrige(Integer onboardingMarrige) 
    {
        this.onboardingMarrige = onboardingMarrige;
    }

    public Integer getOnboardingMarrige() 
    {
        return onboardingMarrige;
    }
    public void setOnboardingCertificate(String onboardingCertificate) 
    {
        this.onboardingCertificate = onboardingCertificate;
    }

    public String getOnboardingCertificate() 
    {
        return onboardingCertificate;
    }
    public void setOnboardingLeve(Long onboardingLeve) 
    {
        this.onboardingLeve = onboardingLeve;
    }

    public Long getOnboardingLeve() 
    {
        return onboardingLeve;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("onboardingId", getOnboardingId())
            .append("onboardingName", getOnboardingName())
            .append("onboardingPicture", getOnboardingPicture())
            .append("date", getDate())
            .append("onboardingPosition", getOnboardingPosition())
            .append("onboardingAge", getOnboardingAge())
            .append("onboardingConstellation", getOnboardingConstellation())
            .append("onboardingEducation", getOnboardingEducation())
            .append("onboardingMarrige", getOnboardingMarrige())
            .append("onboardingCertificate", getOnboardingCertificate())
            .append("onboardingLeve", getOnboardingLeve())
            .toString();
    }
}

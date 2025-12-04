package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 育婴师管理对象 nurserymanage
 * 
 * @author aower
 * @date 2022-02-19
 */
public class Nurserymanage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 育婴师管理编号 */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 照片 */
    @Excel(name = "照片")
    private String picture;

    /** 年龄 */
    @Excel(name = "年龄")
    private Integer age;

    /** 星座 */
    @Excel(name = "星座")
    private String constellation;

    /** 学历 */
    @Excel(name = "学历")
    private String education;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private String maritalStatus;

    /** 证书 */
    @Excel(name = "证书")
    private String Certificate;

    /** 级别 */
    @Excel(name = "级别")
    private String level;

    /** 推荐理由 */
    @Excel(name = "推荐理由")
    private String recommendedReason;

    /** 工作经历 */
    @Excel(name = "工作经历")
    private String experience;

    /** 工作内容 */
    @Excel(name = "工作内容")
    private String content;

    /** 客户评价 */
    @Excel(name = "客户评价")
    private String evaluate;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setAge(Integer age) 
    {
        this.age = age;
    }

    public Integer getAge() 
    {
        return age;
    }
    public void setConstellation(String constellation) 
    {
        this.constellation = constellation;
    }

    public String getConstellation() 
    {
        return constellation;
    }
    public void setEducation(String education) 
    {
        this.education = education;
    }

    public String getEducation() 
    {
        return education;
    }
    public void setMaritalStatus(String maritalStatus) 
    {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() 
    {
        return maritalStatus;
    }
    public void setCertificate(String Certificate) 
    {
        this.Certificate = Certificate;
    }

    public String getCertificate() 
    {
        return Certificate;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setRecommendedReason(String recommendedReason) 
    {
        this.recommendedReason = recommendedReason;
    }

    public String getRecommendedReason() 
    {
        return recommendedReason;
    }
    public void setExperience(String experience) 
    {
        this.experience = experience;
    }

    public String getExperience() 
    {
        return experience;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setEvaluate(String evaluate) 
    {
        this.evaluate = evaluate;
    }

    public String getEvaluate() 
    {
        return evaluate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("picture", getPicture())
            .append("age", getAge())
            .append("constellation", getConstellation())
            .append("education", getEducation())
            .append("maritalStatus", getMaritalStatus())
            .append("Certificate", getCertificate())
            .append("level", getLevel())
            .append("recommendedReason", getRecommendedReason())
            .append("experience", getExperience())
            .append("content", getContent())
            .append("evaluate", getEvaluate())
            .toString();
    }
}

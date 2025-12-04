package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人员信息管理对象 conterman
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Conterman extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工表编号 */
    private Long contermanId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String contermanName;

    /** 照片 */
    @Excel(name = "照片")
    private String contermanPicture;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long contermanAge;

    /** 职位 */
    @Excel(name = "职位")
    private String contermanPosition;

    /** 等级 */
    @Excel(name = "等级")
    private Long contermanLeve;

    /** 星座 */
    @Excel(name = "星座")
    private String contermanConstellation;

    /** 学历 */
    @Excel(name = "学历")
    private String contermanEducation;

    /** 婚姻状况 */
    @Excel(name = "婚姻状况")
    private Integer contermanMarrige;

    /** 证书 */
    @Excel(name = "证书")
    private String contermanCertificate;

    public void setContermanId(Long contermanId) 
    {
        this.contermanId = contermanId;
    }

    public Long getContermanId() 
    {
        return contermanId;
    }
    public void setContermanName(String contermanName) 
    {
        this.contermanName = contermanName;
    }

    public String getContermanName() 
    {
        return contermanName;
    }
    public void setContermanPicture(String contermanPicture) 
    {
        this.contermanPicture = contermanPicture;
    }

    public String getContermanPicture() 
    {
        return contermanPicture;
    }
    public void setContermanAge(Long contermanAge) 
    {
        this.contermanAge = contermanAge;
    }

    public Long getContermanAge() 
    {
        return contermanAge;
    }
    public void setContermanPosition(String contermanPosition) 
    {
        this.contermanPosition = contermanPosition;
    }

    public String getContermanPosition() 
    {
        return contermanPosition;
    }
    public void setContermanLeve(Long contermanLeve) 
    {
        this.contermanLeve = contermanLeve;
    }

    public Long getContermanLeve() 
    {
        return contermanLeve;
    }
    public void setContermanConstellation(String contermanConstellation) 
    {
        this.contermanConstellation = contermanConstellation;
    }

    public String getContermanConstellation() 
    {
        return contermanConstellation;
    }
    public void setContermanEducation(String contermanEducation) 
    {
        this.contermanEducation = contermanEducation;
    }

    public String getContermanEducation() 
    {
        return contermanEducation;
    }
    public void setContermanMarrige(Integer contermanMarrige) 
    {
        this.contermanMarrige = contermanMarrige;
    }

    public Integer getContermanMarrige() 
    {
        return contermanMarrige;
    }
    public void setContermanCertificate(String contermanCertificate) 
    {
        this.contermanCertificate = contermanCertificate;
    }

    public String getContermanCertificate() 
    {
        return contermanCertificate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("contermanId", getContermanId())
            .append("contermanName", getContermanName())
            .append("contermanPicture", getContermanPicture())
            .append("contermanAge", getContermanAge())
            .append("contermanPosition", getContermanPosition())
            .append("contermanLeve", getContermanLeve())
            .append("contermanConstellation", getContermanConstellation())
            .append("contermanEducation", getContermanEducation())
            .append("contermanMarrige", getContermanMarrige())
            .append("contermanCertificate", getContermanCertificate())
            .toString();
    }
}

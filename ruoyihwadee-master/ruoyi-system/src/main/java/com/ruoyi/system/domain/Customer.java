package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户信息录入与分析对象 customer
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户id */
    private Long custometId;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String custoemrPhone;

    /** 预产期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预产期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expectedData;

    /** 需求日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "需求日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date damandData;

    /** 需求内容 */
    @Excel(name = "需求内容")
    private String Damand;

    /** 等级 */
    @Excel(name = "等级")
    private Long customerLevel;

    /** 客户来源 */
    @Excel(name = "客户来源")
    private String CustomerSource;

    /** 育婴顾问 */
    @Excel(name = "育婴顾问")
    private String Counterman;

    /** 育婴师 */
    @Excel(name = "育婴师")
    private String nursery;

    public void setCustometId(Long custometId) 
    {
        this.custometId = custometId;
    }

    public Long getCustometId() 
    {
        return custometId;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setCustoemrPhone(String custoemrPhone) 
    {
        this.custoemrPhone = custoemrPhone;
    }

    public String getCustoemrPhone() 
    {
        return custoemrPhone;
    }
    public void setExpectedData(Date expectedData) 
    {
        this.expectedData = expectedData;
    }

    public Date getExpectedData() 
    {
        return expectedData;
    }
    public void setDamandData(Date damandData) 
    {
        this.damandData = damandData;
    }

    public Date getDamandData() 
    {
        return damandData;
    }
    public void setDamand(String Damand) 
    {
        this.Damand = Damand;
    }

    public String getDamand() 
    {
        return Damand;
    }
    public void setCustomerLevel(Long customerLevel) 
    {
        this.customerLevel = customerLevel;
    }

    public Long getCustomerLevel() 
    {
        return customerLevel;
    }
    public void setCustomerSource(String CustomerSource) 
    {
        this.CustomerSource = CustomerSource;
    }

    public String getCustomerSource() 
    {
        return CustomerSource;
    }
    public void setCounterman(String Counterman) 
    {
        this.Counterman = Counterman;
    }

    public String getCounterman() 
    {
        return Counterman;
    }
    public void setNursery(String nursery) 
    {
        this.nursery = nursery;
    }

    public String getNursery() 
    {
        return nursery;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("custometId", getCustometId())
            .append("customerName", getCustomerName())
            .append("custoemrPhone", getCustoemrPhone())
            .append("expectedData", getExpectedData())
            .append("damandData", getDamandData())
            .append("Damand", getDamand())
            .append("customerLevel", getCustomerLevel())
            .append("CustomerSource", getCustomerSource())
            .append("Counterman", getCounterman())
            .append("nursery", getNursery())
            .toString();
    }
}

package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同信息表对象 contractinformation
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Contractinformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同信息表编号 */
    private Integer id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 电话 */
    @Excel(name = "电话")
    private String customerPhone;

    /** 预产期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预产期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expectedData;

    /** 服务日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "服务日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date damandData;

    /** 服务内容 */
    @Excel(name = "服务内容")
    private String Damand;

    /** 等级 */
    @Excel(name = "等级")
    private String customerLevel;

    /** 育婴师顾问 */
    @Excel(name = "育婴师顾问")
    private String countermanName;

    /** 育婴师 */
    @Excel(name = "育婴师")
    private String nurseryName;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private Long Amount;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setCustomerPhone(String customerPhone) 
    {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() 
    {
        return customerPhone;
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
    public void setCustomerLevel(String customerLevel) 
    {
        this.customerLevel = customerLevel;
    }

    public String getCustomerLevel() 
    {
        return customerLevel;
    }
    public void setCountermanName(String countermanName) 
    {
        this.countermanName = countermanName;
    }

    public String getCountermanName() 
    {
        return countermanName;
    }
    public void setNurseryName(String nurseryName) 
    {
        this.nurseryName = nurseryName;
    }

    public String getNurseryName() 
    {
        return nurseryName;
    }
    public void setAmount(Long Amount) 
    {
        this.Amount = Amount;
    }

    public Long getAmount() 
    {
        return Amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("customerName", getCustomerName())
            .append("customerPhone", getCustomerPhone())
            .append("expectedData", getExpectedData())
            .append("damandData", getDamandData())
            .append("Damand", getDamand())
            .append("customerLevel", getCustomerLevel())
            .append("countermanName", getCountermanName())
            .append("nurseryName", getNurseryName())
            .append("Amount", getAmount())
            .toString();
    }
}

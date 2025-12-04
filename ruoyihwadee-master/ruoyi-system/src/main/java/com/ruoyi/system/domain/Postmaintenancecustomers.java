package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 后期维护客户表对象 postmaintenancecustomers
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Postmaintenancecustomers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 后期维护客户编号 */
    private Integer id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 客户来源 */
    @Excel(name = "客户来源")
    private String customerComeFrom;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 客户地址 */
    @Excel(name = "客户地址")
    private String address;

    /** 合同时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "合同时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 需求内容 */
    @Excel(name = "需求内容")
    private String CustomerRequire;

    /** 等级 */
    @Excel(name = "等级")
    private String level;

    /** 宝宝基本信息 */
    @Excel(name = "宝宝基本信息")
    private String basicInformation;

    /** 育婴顾问 */
    @Excel(name = "育婴顾问")
    private String counterman;

    /** 育婴师 */
    @Excel(name = "育婴师")
    private String nursery;

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
    public void setCustomerComeFrom(String customerComeFrom) 
    {
        this.customerComeFrom = customerComeFrom;
    }

    public String getCustomerComeFrom() 
    {
        return customerComeFrom;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setCustomerRequire(String CustomerRequire) 
    {
        this.CustomerRequire = CustomerRequire;
    }

    public String getCustomerRequire() 
    {
        return CustomerRequire;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setBasicInformation(String basicInformation) 
    {
        this.basicInformation = basicInformation;
    }

    public String getBasicInformation() 
    {
        return basicInformation;
    }
    public void setCounterman(String counterman) 
    {
        this.counterman = counterman;
    }

    public String getCounterman() 
    {
        return counterman;
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
            .append("id", getId())
            .append("customerName", getCustomerName())
            .append("customerComeFrom", getCustomerComeFrom())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("date", getDate())
            .append("CustomerRequire", getCustomerRequire())
            .append("level", getLevel())
            .append("basicInformation", getBasicInformation())
            .append("counterman", getCounterman())
            .append("nursery", getNursery())
            .toString();
    }
}

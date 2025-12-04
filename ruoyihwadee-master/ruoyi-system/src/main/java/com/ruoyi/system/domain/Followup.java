package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 跟进情况对象 followup
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Followup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 跟进情况编号 */
    private Integer id;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String name;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 客户住址 */
    @Excel(name = "客户住址")
    private String address;

    /** 所需要求 */
    @Excel(name = "所需要求")
    private String CustomerRequire;

    /** 需要时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "需要时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 跟进进度 */
    @Excel(name = "跟进进度")
    private String schedule;

    /** 对接职员 */
    @Excel(name = "对接职员")
    private String staff;

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
    public void setCustomerRequire(String CustomerRequire) 
    {
        this.CustomerRequire = CustomerRequire;
    }

    public String getCustomerRequire() 
    {
        return CustomerRequire;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setSchedule(String schedule) 
    {
        this.schedule = schedule;
    }

    public String getSchedule() 
    {
        return schedule;
    }
    public void setStaff(String staff) 
    {
        this.staff = staff;
    }

    public String getStaff() 
    {
        return staff;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("CustomerRequire", getCustomerRequire())
            .append("time", getTime())
            .append("schedule", getSchedule())
            .append("staff", getStaff())
            .toString();
    }
}

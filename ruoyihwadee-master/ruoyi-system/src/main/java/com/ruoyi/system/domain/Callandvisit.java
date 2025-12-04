package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 来电来访情况对象 callandvisit
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Callandvisit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 来电来访情况编号 */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 客户住址 */
    @Excel(name = "客户住址")
    private String position;

    /** 所需要求 */
    @Excel(name = "所需要求")
    private String customerRequire;

    /** 需要时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "需要时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date requireTime;

    /** 沟通内容 */
    @Excel(name = "沟通内容")
    private String content;

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
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setCustomerRequire(String customerRequire) 
    {
        this.customerRequire = customerRequire;
    }

    public String getCustomerRequire() 
    {
        return customerRequire;
    }
    public void setRequireTime(Date requireTime) 
    {
        this.requireTime = requireTime;
    }

    public Date getRequireTime() 
    {
        return requireTime;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
            .append("position", getPosition())
            .append("customerRequire", getCustomerRequire())
            .append("requireTime", getRequireTime())
            .append("content", getContent())
            .append("staff", getStaff())
            .toString();
    }
}

package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售情况对象 sales
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Sales extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 销售情况编号 */
    private Integer id;

    /** 销售人员 */
    @Excel(name = "销售人员")
    private String conterman;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customer;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 所需服务 */
    @Excel(name = "所需服务")
    private String CustomerRequire;

    /** 预计收款金额 */
    @Excel(name = "预计收款金额")
    private Integer payment;

    /** 预计签约时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计签约时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signingTime;

    /** 项目状态 */
    @Excel(name = "项目状态")
    private String state;

    /** 行动计划 */
    @Excel(name = "行动计划")
    private String actionPlan;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setConterman(String conterman) 
    {
        this.conterman = conterman;
    }

    public String getConterman() 
    {
        return conterman;
    }
    public void setCustomer(String customer) 
    {
        this.customer = customer;
    }

    public String getCustomer() 
    {
        return customer;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCustomerRequire(String CustomerRequire) 
    {
        this.CustomerRequire = CustomerRequire;
    }

    public String getCustomerRequire() 
    {
        return CustomerRequire;
    }
    public void setPayment(Integer payment) 
    {
        this.payment = payment;
    }

    public Integer getPayment() 
    {
        return payment;
    }
    public void setSigningTime(Date signingTime) 
    {
        this.signingTime = signingTime;
    }

    public Date getSigningTime() 
    {
        return signingTime;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setActionPlan(String actionPlan) 
    {
        this.actionPlan = actionPlan;
    }

    public String getActionPlan() 
    {
        return actionPlan;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("conterman", getConterman())
            .append("customer", getCustomer())
            .append("phone", getPhone())
            .append("CustomerRequire", getCustomerRequire())
            .append("payment", getPayment())
            .append("signingTime", getSigningTime())
            .append("state", getState())
            .append("actionPlan", getActionPlan())
            .toString();
    }
}

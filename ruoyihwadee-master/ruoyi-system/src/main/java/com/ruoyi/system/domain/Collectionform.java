package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收款表对象 collectionform
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Collectionform extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 合同号 */
    @Excel(name = "合同号")
    private String contractId;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 金额 */
    @Excel(name = "金额")
    private String Amount;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date Time;

    public void setContractId(String contractId) 
    {
        this.contractId = contractId;
    }

    public String getContractId() 
    {
        return contractId;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setAmount(String Amount) 
    {
        this.Amount = Amount;
    }

    public String getAmount() 
    {
        return Amount;
    }
    public void setTime(Date Time) 
    {
        this.Time = Time;
    }

    public Date getTime() 
    {
        return Time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("contractId", getContractId())
            .append("customerName", getCustomerName())
            .append("Amount", getAmount())
            .append("Time", getTime())
            .toString();
    }
}

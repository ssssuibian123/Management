package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收款信息表对象 billingmessage
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Billingmessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收款信息表编号 */
    private Integer id;

    /** 销售人员 */
    @Excel(name = "销售人员")
    private String conterman;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customer;

    /** 客户级别 */
    @Excel(name = "客户级别")
    private String level;

    /** 收款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "收款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 服务内容 */
    @Excel(name = "服务内容")
    private String content;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private Integer ids;

    /** 合同金额 */
    @Excel(name = "合同金额")
    private Integer ContractAmount;

    /** 收款金额 */
    @Excel(name = "收款金额")
    private Integer AmountBefore;

    /** 尾款金额 */
    @Excel(name = "尾款金额")
    private Integer AmountAfter;

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
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setIds(Integer ids) 
    {
        this.ids = ids;
    }

    public Integer getIds() 
    {
        return ids;
    }
    public void setContractAmount(Integer ContractAmount) 
    {
        this.ContractAmount = ContractAmount;
    }

    public Integer getContractAmount() 
    {
        return ContractAmount;
    }
    public void setAmountBefore(Integer AmountBefore) 
    {
        this.AmountBefore = AmountBefore;
    }

    public Integer getAmountBefore() 
    {
        return AmountBefore;
    }
    public void setAmountAfter(Integer AmountAfter) 
    {
        this.AmountAfter = AmountAfter;
    }

    public Integer getAmountAfter() 
    {
        return AmountAfter;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("conterman", getConterman())
            .append("customer", getCustomer())
            .append("level", getLevel())
            .append("date", getDate())
            .append("content", getContent())
            .append("ids", getIds())
            .append("ContractAmount", getContractAmount())
            .append("AmountBefore", getAmountBefore())
            .append("AmountAfter", getAmountAfter())
            .toString();
    }
}

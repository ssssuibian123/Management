package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户跟进记录对象 customerfollowrecords
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Customerfollowrecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户跟进记录编号 */
    private Long id;

    /** 联系人编号 */
    @Excel(name = "联系人编号")
    private Long waiterId;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String waiterName;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private Long customerId;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String customerName;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date RecordsData;

    /** 关系 */
    @Excel(name = "关系")
    private String Relationship;

    /** 沟通内容 */
    @Excel(name = "沟通内容")
    private String communicationContent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWaiterId(Long waiterId) 
    {
        this.waiterId = waiterId;
    }

    public Long getWaiterId() 
    {
        return waiterId;
    }
    public void setWaiterName(String waiterName) 
    {
        this.waiterName = waiterName;
    }

    public String getWaiterName() 
    {
        return waiterName;
    }
    public void setCustomerId(Long customerId) 
    {
        this.customerId = customerId;
    }

    public Long getCustomerId() 
    {
        return customerId;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setRecordsData(Date RecordsData) 
    {
        this.RecordsData = RecordsData;
    }

    public Date getRecordsData() 
    {
        return RecordsData;
    }
    public void setRelationship(String Relationship) 
    {
        this.Relationship = Relationship;
    }

    public String getRelationship() 
    {
        return Relationship;
    }
    public void setCommunicationContent(String communicationContent) 
    {
        this.communicationContent = communicationContent;
    }

    public String getCommunicationContent() 
    {
        return communicationContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("waiterId", getWaiterId())
            .append("waiterName", getWaiterName())
            .append("customerId", getCustomerId())
            .append("customerName", getCustomerName())
            .append("RecordsData", getRecordsData())
            .append("Relationship", getRelationship())
            .append("communicationContent", getCommunicationContent())
            .toString();
    }
}

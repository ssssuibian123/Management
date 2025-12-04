package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户回访记录对象 customerreturnvisitrecord
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Customerreturnvisitrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户回访记录编号 */
    private Integer id;

    /** 联系人 */
    @Excel(name = "联系人")
    private String Contact;

    /** 回访日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回访日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date VisitDate;

    /** 沟通内容 */
    @Excel(name = "沟通内容")
    private String Content;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setContact(String Contact) 
    {
        this.Contact = Contact;
    }

    public String getContact() 
    {
        return Contact;
    }
    public void setVisitDate(Date VisitDate) 
    {
        this.VisitDate = VisitDate;
    }

    public Date getVisitDate() 
    {
        return VisitDate;
    }
    public void setContent(String Content) 
    {
        this.Content = Content;
    }

    public String getContent() 
    {
        return Content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("Contact", getContact())
            .append("VisitDate", getVisitDate())
            .append("Content", getContent())
            .toString();
    }
}

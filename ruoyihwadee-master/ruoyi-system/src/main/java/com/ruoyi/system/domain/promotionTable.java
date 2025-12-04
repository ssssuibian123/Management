package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 晋升表对象 promotiontable
 * 
 * @author aower
 * @date 2022-02-17
 */
public class promotionTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 晋升表编号 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 原等级 */
    @Excel(name = "原等级")
    private String beforeLevel;

    /** 现等级 */
    @Excel(name = "现等级")
    private String nowLevel;

    /** 升级时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "升级时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 评价时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评价时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
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
    public void setBeforeLevel(String beforeLevel) 
    {
        this.beforeLevel = beforeLevel;
    }

    public String getBeforeLevel() 
    {
        return beforeLevel;
    }
    public void setNowLevel(String nowLevel) 
    {
        this.nowLevel = nowLevel;
    }

    public String getNowLevel() 
    {
        return nowLevel;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("beforeLevel", getBeforeLevel())
            .append("nowLevel", getNowLevel())
            .append("date", getDate())
            .append("time", getTime())
            .toString();
    }
}

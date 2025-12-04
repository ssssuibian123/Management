package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 签到情况对象 attendance
 * 
 * @author ruoyi
 * @date 2021-06-22
 */
public class Attendance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 名字 */
    @Excel(name = "名字")
    private String name;

    /** 学生学号 */
    @Excel(name = "学生学号")
    private String stuId;

    /** 是否签到 */
    @Excel(name = "是否签到")
    private Integer isSign;

    /** 日 */
    @Excel(name = "日")
    private Integer day;

    /** 月 */
    @Excel(name = "月")
    private Integer month;

    /** 年 */
    @Excel(name = "年")
    private Integer year;

    /** 日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 是否请假 */
    @Excel(name = "是否请假")
    private Integer isAsked;

    /** 是否迟到 */
    @Excel(name = "是否迟到")
    private Integer isLate;

    /** 位置信息 */
    @Excel(name = "位置信息")
    private String gpsMsg;

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStuId(String stuId) 
    {
        this.stuId = stuId;
    }

    public String getStuId() 
    {
        return stuId;
    }
    public void setIsSign(Integer isSign) 
    {
        this.isSign = isSign;
    }

    public Integer getIsSign() 
    {
        return isSign;
    }
    public void setDay(Integer day) 
    {
        this.day = day;
    }

    public Integer getDay() 
    {
        return day;
    }
    public void setMonth(Integer month) 
    {
        this.month = month;
    }

    public Integer getMonth() 
    {
        return month;
    }
    public void setYear(Integer year) 
    {
        this.year = year;
    }

    public Integer getYear() 
    {
        return year;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setIsAsked(Integer isAsked) 
    {
        this.isAsked = isAsked;
    }

    public Integer getIsAsked() 
    {
        return isAsked;
    }
    public void setIsLate(Integer isLate) 
    {
        this.isLate = isLate;
    }

    public Integer getIsLate() 
    {
        return isLate;
    }
    public void setGpsMsg(String gpsMsg) 
    {
        this.gpsMsg = gpsMsg;
    }

    public String getGpsMsg() 
    {
        return gpsMsg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("name", getName())
            .append("stuId", getStuId())
            .append("isSign", getIsSign())
            .append("day", getDay())
            .append("month", getMonth())
            .append("year", getYear())
            .append("date", getDate())
            .append("isAsked", getIsAsked())
            .append("isLate", getIsLate())
            .append("gpsMsg", getGpsMsg())
            .toString();
    }
}

package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 育婴师空闲表对象 nurseryfree
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Nurseryfree extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 育婴师空闲表编号 */
    private Integer id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 照片 */
    @Excel(name = "照片")
    private String picture;

    /** 等级 */
    @Excel(name = "等级")
    private String level;

    /** 居住地 */
    @Excel(name = "居住地")
    private String position;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date beginTime;

    /** 空闲时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "空闲时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date freeTime;

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
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }
    public void setLevel(String level) 
    {
        this.level = level;
    }

    public String getLevel() 
    {
        return level;
    }
    public void setPosition(String position) 
    {
        this.position = position;
    }

    public String getPosition() 
    {
        return position;
    }
    public void setBeginTime(Date beginTime) 
    {
        this.beginTime = beginTime;
    }

    public Date getBeginTime() 
    {
        return beginTime;
    }
    public void setFreeTime(Date freeTime) 
    {
        this.freeTime = freeTime;
    }

    public Date getFreeTime() 
    {
        return freeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("picture", getPicture())
            .append("level", getLevel())
            .append("position", getPosition())
            .append("beginTime", getBeginTime())
            .append("freeTime", getFreeTime())
            .toString();
    }
}

package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 结算与评价记录对象 billingevaluationrecords
 * 
 * @author aower
 * @date 2022-02-17
 */
public class Billingevaluationrecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 结算与评价记录编号 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 工资 */
    @Excel(name = "工资")
    private String salary;

    /** 合同号 */
    @Excel(name = "合同号")
    private String Contract;

    /** 客户评价 */
    @Excel(name = "客户评价")
    private String Content;

    /** 服务评分 */
    @Excel(name = "服务评分")
    private Integer score;

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
    public void setSalary(String salary) 
    {
        this.salary = salary;
    }

    public String getSalary() 
    {
        return salary;
    }
    public void setContract(String Contract) 
    {
        this.Contract = Contract;
    }

    public String getContract() 
    {
        return Contract;
    }
    public void setContent(String Content) 
    {
        this.Content = Content;
    }

    public String getContent() 
    {
        return Content;
    }
    public void setScore(Integer score) 
    {
        this.score = score;
    }

    public Integer getScore() 
    {
        return score;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("salary", getSalary())
            .append("Contract", getContract())
            .append("Content", getContent())
            .append("score", getScore())
            .toString();
    }
}

package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Customerreturnvisitrecord;

/**
 * 客户回访记录Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface CustomerreturnvisitrecordMapper 
{
    /**
     * 查询客户回访记录
     * 
     * @param id 客户回访记录ID
     * @return 客户回访记录
     */
    public Customerreturnvisitrecord selectCustomerreturnvisitrecordById(Integer id);

    /**
     * 查询客户回访记录列表
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 客户回访记录集合
     */
    public List<Customerreturnvisitrecord> selectCustomerreturnvisitrecordList(Customerreturnvisitrecord customerreturnvisitrecord);

    /**
     * 新增客户回访记录
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 结果
     */
    public int insertCustomerreturnvisitrecord(Customerreturnvisitrecord customerreturnvisitrecord);

    /**
     * 修改客户回访记录
     * 
     * @param customerreturnvisitrecord 客户回访记录
     * @return 结果
     */
    public int updateCustomerreturnvisitrecord(Customerreturnvisitrecord customerreturnvisitrecord);

    /**
     * 删除客户回访记录
     * 
     * @param id 客户回访记录ID
     * @return 结果
     */
    public int deleteCustomerreturnvisitrecordById(Integer id);

    /**
     * 批量删除客户回访记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerreturnvisitrecordByIds(String[] ids);
}

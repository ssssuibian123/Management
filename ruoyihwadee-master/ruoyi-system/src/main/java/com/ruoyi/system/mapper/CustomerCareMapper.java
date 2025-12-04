package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CustomerCare;

/**
 * CustomerCareMapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface CustomerCareMapper 
{
    /**
     * 查询CustomerCare
     * 
     * @param id CustomerCareID
     * @return CustomerCare
     */
    public CustomerCare selectCustomerCareById(Long id);

    /**
     * 查询CustomerCare列表
     * 
     * @param customerCare CustomerCare
     * @return CustomerCare集合
     */
    public List<CustomerCare> selectCustomerCareList(CustomerCare customerCare);

    /**
     * 新增CustomerCare
     * 
     * @param customerCare CustomerCare
     * @return 结果
     */
    public int insertCustomerCare(CustomerCare customerCare);

    /**
     * 修改CustomerCare
     * 
     * @param customerCare CustomerCare
     * @return 结果
     */
    public int updateCustomerCare(CustomerCare customerCare);

    /**
     * 删除CustomerCare
     * 
     * @param id CustomerCareID
     * @return 结果
     */
    public int deleteCustomerCareById(Long id);

    /**
     * 批量删除CustomerCare
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerCareByIds(String[] ids);
}

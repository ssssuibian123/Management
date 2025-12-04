package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Customer;

/**
 * 客户信息录入与分析Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ICustomerService 
{
    /**
     * 查询客户信息录入与分析
     * 
     * @param custometId 客户信息录入与分析ID
     * @return 客户信息录入与分析
     */
    public Customer selectCustomerById(Long custometId);

    /**
     * 查询客户信息录入与分析列表
     * 
     * @param customer 客户信息录入与分析
     * @return 客户信息录入与分析集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增客户信息录入与分析
     * 
     * @param customer 客户信息录入与分析
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改客户信息录入与分析
     * 
     * @param customer 客户信息录入与分析
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 批量删除客户信息录入与分析
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCustomerByIds(String ids);

    /**
     * 删除客户信息录入与分析信息
     * 
     * @param custometId 客户信息录入与分析ID
     * @return 结果
     */
    public int deleteCustomerById(Long custometId);
}

package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerMapper;
import com.ruoyi.system.domain.Customer;
import com.ruoyi.system.service.ICustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户信息录入与分析Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CustomerServiceImpl implements ICustomerService 
{
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询客户信息录入与分析
     * 
     * @param custometId 客户信息录入与分析ID
     * @return 客户信息录入与分析
     */
    @Override
    public Customer selectCustomerById(Long custometId)
    {
        return customerMapper.selectCustomerById(custometId);
    }

    /**
     * 查询客户信息录入与分析列表
     * 
     * @param customer 客户信息录入与分析
     * @return 客户信息录入与分析
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer)
    {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增客户信息录入与分析
     * 
     * @param customer 客户信息录入与分析
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer)
    {
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改客户信息录入与分析
     * 
     * @param customer 客户信息录入与分析
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer)
    {
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 删除客户信息录入与分析对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCustomerByIds(String ids)
    {
        return customerMapper.deleteCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息录入与分析信息
     * 
     * @param custometId 客户信息录入与分析ID
     * @return 结果
     */
    @Override
    public int deleteCustomerById(Long custometId)
    {
        return customerMapper.deleteCustomerById(custometId);
    }
}

package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SalesMapper;
import com.ruoyi.system.domain.Sales;
import com.ruoyi.system.service.ISalesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售情况Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class SalesServiceImpl implements ISalesService 
{
    @Autowired
    private SalesMapper salesMapper;

    /**
     * 查询销售情况
     * 
     * @param id 销售情况ID
     * @return 销售情况
     */
    @Override
    public Sales selectSalesById(Integer id)
    {
        return salesMapper.selectSalesById(id);
    }

    /**
     * 查询销售情况列表
     * 
     * @param sales 销售情况
     * @return 销售情况
     */
    @Override
    public List<Sales> selectSalesList(Sales sales)
    {
        return salesMapper.selectSalesList(sales);
    }

    /**
     * 新增销售情况
     * 
     * @param sales 销售情况
     * @return 结果
     */
    @Override
    public int insertSales(Sales sales)
    {
        return salesMapper.insertSales(sales);
    }

    /**
     * 修改销售情况
     * 
     * @param sales 销售情况
     * @return 结果
     */
    @Override
    public int updateSales(Sales sales)
    {
        return salesMapper.updateSales(sales);
    }

    /**
     * 删除销售情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSalesByIds(String ids)
    {
        return salesMapper.deleteSalesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售情况信息
     * 
     * @param id 销售情况ID
     * @return 结果
     */
    @Override
    public int deleteSalesById(Integer id)
    {
        return salesMapper.deleteSalesById(id);
    }
}

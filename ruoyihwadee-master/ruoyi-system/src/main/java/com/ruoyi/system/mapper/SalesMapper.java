package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Sales;

/**
 * 销售情况Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface SalesMapper 
{
    /**
     * 查询销售情况
     * 
     * @param id 销售情况ID
     * @return 销售情况
     */
    public Sales selectSalesById(Integer id);

    /**
     * 查询销售情况列表
     * 
     * @param sales 销售情况
     * @return 销售情况集合
     */
    public List<Sales> selectSalesList(Sales sales);

    /**
     * 新增销售情况
     * 
     * @param sales 销售情况
     * @return 结果
     */
    public int insertSales(Sales sales);

    /**
     * 修改销售情况
     * 
     * @param sales 销售情况
     * @return 结果
     */
    public int updateSales(Sales sales);

    /**
     * 删除销售情况
     * 
     * @param id 销售情况ID
     * @return 结果
     */
    public int deleteSalesById(Integer id);

    /**
     * 批量删除销售情况
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSalesByIds(String[] ids);
}

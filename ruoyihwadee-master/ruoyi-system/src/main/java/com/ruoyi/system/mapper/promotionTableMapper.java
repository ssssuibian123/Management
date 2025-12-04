package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.promotionTable;

/**
 * 晋升表Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface promotionTableMapper 
{
    /**
     * 查询晋升表
     * 
     * @param id 晋升表ID
     * @return 晋升表
     */
    public promotionTable selectpromotionTableById(Long id);

    /**
     * 查询晋升表列表
     * 
     * @param promotionTable 晋升表
     * @return 晋升表集合
     */
    public List<promotionTable> selectpromotionTableList(promotionTable promotionTable);

    /**
     * 新增晋升表
     * 
     * @param promotionTable 晋升表
     * @return 结果
     */
    public int insertpromotionTable(promotionTable promotionTable);

    /**
     * 修改晋升表
     * 
     * @param promotionTable 晋升表
     * @return 结果
     */
    public int updatepromotionTable(promotionTable promotionTable);

    /**
     * 删除晋升表
     * 
     * @param id 晋升表ID
     * @return 结果
     */
    public int deletepromotionTableById(Long id);

    /**
     * 批量删除晋升表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletepromotionTableByIds(String[] ids);
}

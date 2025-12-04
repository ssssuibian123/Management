package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.promotionTableMapper;
import com.ruoyi.system.domain.promotionTable;
import com.ruoyi.system.service.IpromotionTableService;
import com.ruoyi.common.core.text.Convert;

/**
 * 晋升表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class promotionTableServiceImpl implements IpromotionTableService 
{
    @Autowired
    private promotionTableMapper promotionTableMapper;

    /**
     * 查询晋升表
     * 
     * @param id 晋升表ID
     * @return 晋升表
     */
    @Override
    public promotionTable selectpromotionTableById(Long id)
    {
        return promotionTableMapper.selectpromotionTableById(id);
    }

    /**
     * 查询晋升表列表
     * 
     * @param promotionTable 晋升表
     * @return 晋升表
     */
    @Override
    public List<promotionTable> selectpromotionTableList(promotionTable promotionTable)
    {
        return promotionTableMapper.selectpromotionTableList(promotionTable);
    }

    /**
     * 新增晋升表
     * 
     * @param promotionTable 晋升表
     * @return 结果
     */
    @Override
    public int insertpromotionTable(promotionTable promotionTable)
    {
        return promotionTableMapper.insertpromotionTable(promotionTable);
    }

    /**
     * 修改晋升表
     * 
     * @param promotionTable 晋升表
     * @return 结果
     */
    @Override
    public int updatepromotionTable(promotionTable promotionTable)
    {
        return promotionTableMapper.updatepromotionTable(promotionTable);
    }

    /**
     * 删除晋升表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletepromotionTableByIds(String ids)
    {
        return promotionTableMapper.deletepromotionTableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除晋升表信息
     * 
     * @param id 晋升表ID
     * @return 结果
     */
    @Override
    public int deletepromotionTableById(Long id)
    {
        return promotionTableMapper.deletepromotionTableById(id);
    }
}

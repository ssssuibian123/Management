package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NurseryworkingMapper;
import com.ruoyi.system.domain.Nurseryworking;
import com.ruoyi.system.service.INurseryworkingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 育婴师工作状态表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class NurseryworkingServiceImpl implements INurseryworkingService 
{
    @Autowired
    private NurseryworkingMapper nurseryworkingMapper;

    /**
     * 查询育婴师工作状态表
     * 
     * @param id 育婴师工作状态表ID
     * @return 育婴师工作状态表
     */
    @Override
    public Nurseryworking selectNurseryworkingById(Integer id)
    {
        return nurseryworkingMapper.selectNurseryworkingById(id);
    }

    /**
     * 查询育婴师工作状态表列表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 育婴师工作状态表
     */
    @Override
    public List<Nurseryworking> selectNurseryworkingList(Nurseryworking nurseryworking)
    {
        return nurseryworkingMapper.selectNurseryworkingList(nurseryworking);
    }

    /**
     * 新增育婴师工作状态表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 结果
     */
    @Override
    public int insertNurseryworking(Nurseryworking nurseryworking)
    {
        return nurseryworkingMapper.insertNurseryworking(nurseryworking);
    }

    /**
     * 修改育婴师工作状态表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 结果
     */
    @Override
    public int updateNurseryworking(Nurseryworking nurseryworking)
    {
        return nurseryworkingMapper.updateNurseryworking(nurseryworking);
    }

    /**
     * 删除育婴师工作状态表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNurseryworkingByIds(String ids)
    {
        return nurseryworkingMapper.deleteNurseryworkingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除育婴师工作状态表信息
     * 
     * @param id 育婴师工作状态表ID
     * @return 结果
     */
    @Override
    public int deleteNurseryworkingById(Integer id)
    {
        return nurseryworkingMapper.deleteNurseryworkingById(id);
    }
}

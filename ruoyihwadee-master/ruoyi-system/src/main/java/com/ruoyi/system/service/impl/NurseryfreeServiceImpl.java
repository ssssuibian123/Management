package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NurseryfreeMapper;
import com.ruoyi.system.domain.Nurseryfree;
import com.ruoyi.system.service.INurseryfreeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 育婴师空闲表Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class NurseryfreeServiceImpl implements INurseryfreeService 
{
    @Autowired
    private NurseryfreeMapper nurseryfreeMapper;

    /**
     * 查询育婴师空闲表
     * 
     * @param id 育婴师空闲表ID
     * @return 育婴师空闲表
     */
    @Override
    public Nurseryfree selectNurseryfreeById(Integer id)
    {
        return nurseryfreeMapper.selectNurseryfreeById(id);
    }

    /**
     * 查询育婴师空闲表列表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 育婴师空闲表
     */
    @Override
    public List<Nurseryfree> selectNurseryfreeList(Nurseryfree nurseryfree)
    {
        return nurseryfreeMapper.selectNurseryfreeList(nurseryfree);
    }

    /**
     * 新增育婴师空闲表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 结果
     */
    @Override
    public int insertNurseryfree(Nurseryfree nurseryfree)
    {
        return nurseryfreeMapper.insertNurseryfree(nurseryfree);
    }

    /**
     * 修改育婴师空闲表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 结果
     */
    @Override
    public int updateNurseryfree(Nurseryfree nurseryfree)
    {
        return nurseryfreeMapper.updateNurseryfree(nurseryfree);
    }

    /**
     * 删除育婴师空闲表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNurseryfreeByIds(String ids)
    {
        return nurseryfreeMapper.deleteNurseryfreeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除育婴师空闲表信息
     * 
     * @param id 育婴师空闲表ID
     * @return 结果
     */
    @Override
    public int deleteNurseryfreeById(Integer id)
    {
        return nurseryfreeMapper.deleteNurseryfreeById(id);
    }
}

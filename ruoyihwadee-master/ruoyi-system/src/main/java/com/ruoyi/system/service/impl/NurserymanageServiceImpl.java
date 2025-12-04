package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NurserymanageMapper;
import com.ruoyi.system.domain.Nurserymanage;
import com.ruoyi.system.service.INurserymanageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 育婴师管理Service业务层处理
 * 
 * @author aower
 * @date 2022-02-19
 */
@Service
public class NurserymanageServiceImpl implements INurserymanageService 
{
    @Autowired
    private NurserymanageMapper nurserymanageMapper;

    /**
     * 查询育婴师管理
     * 
     * @param id 育婴师管理ID
     * @return 育婴师管理
     */
    @Override
    public Nurserymanage selectNurserymanageById(Integer id)
    {
        return nurserymanageMapper.selectNurserymanageById(id);
    }

    /**
     * 查询育婴师管理列表
     * 
     * @param nurserymanage 育婴师管理
     * @return 育婴师管理
     */
    @Override
    public List<Nurserymanage> selectNurserymanageList(Nurserymanage nurserymanage)
    {
        return nurserymanageMapper.selectNurserymanageList(nurserymanage);
    }

    /**
     * 新增育婴师管理
     * 
     * @param nurserymanage 育婴师管理
     * @return 结果
     */
    @Override
    public int insertNurserymanage(Nurserymanage nurserymanage)
    {
        return nurserymanageMapper.insertNurserymanage(nurserymanage);
    }

    /**
     * 修改育婴师管理
     * 
     * @param nurserymanage 育婴师管理
     * @return 结果
     */
    @Override
    public int updateNurserymanage(Nurserymanage nurserymanage)
    {
        return nurserymanageMapper.updateNurserymanage(nurserymanage);
    }

    /**
     * 删除育婴师管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNurserymanageByIds(String ids)
    {
        return nurserymanageMapper.deleteNurserymanageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除育婴师管理信息
     * 
     * @param id 育婴师管理ID
     * @return 结果
     */
    @Override
    public int deleteNurserymanageById(Integer id)
    {
        return nurserymanageMapper.deleteNurserymanageById(id);
    }
}

package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NurseryvisitrecordMapper;
import com.ruoyi.system.domain.Nurseryvisitrecord;
import com.ruoyi.system.service.INurseryvisitrecordService;
import com.ruoyi.common.core.text.Convert;

/**
 * 育婴师回访记录Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class NurseryvisitrecordServiceImpl implements INurseryvisitrecordService 
{
    @Autowired
    private NurseryvisitrecordMapper nurseryvisitrecordMapper;

    /**
     * 查询育婴师回访记录
     * 
     * @param id 育婴师回访记录ID
     * @return 育婴师回访记录
     */
    @Override
    public Nurseryvisitrecord selectNurseryvisitrecordById(Long id)
    {
        return nurseryvisitrecordMapper.selectNurseryvisitrecordById(id);
    }

    /**
     * 查询育婴师回访记录列表
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 育婴师回访记录
     */
    @Override
    public List<Nurseryvisitrecord> selectNurseryvisitrecordList(Nurseryvisitrecord nurseryvisitrecord)
    {
        return nurseryvisitrecordMapper.selectNurseryvisitrecordList(nurseryvisitrecord);
    }

    /**
     * 新增育婴师回访记录
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 结果
     */
    @Override
    public int insertNurseryvisitrecord(Nurseryvisitrecord nurseryvisitrecord)
    {
        return nurseryvisitrecordMapper.insertNurseryvisitrecord(nurseryvisitrecord);
    }

    /**
     * 修改育婴师回访记录
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 结果
     */
    @Override
    public int updateNurseryvisitrecord(Nurseryvisitrecord nurseryvisitrecord)
    {
        return nurseryvisitrecordMapper.updateNurseryvisitrecord(nurseryvisitrecord);
    }

    /**
     * 删除育婴师回访记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNurseryvisitrecordByIds(String ids)
    {
        return nurseryvisitrecordMapper.deleteNurseryvisitrecordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除育婴师回访记录信息
     * 
     * @param id 育婴师回访记录ID
     * @return 结果
     */
    @Override
    public int deleteNurseryvisitrecordById(Long id)
    {
        return nurseryvisitrecordMapper.deleteNurseryvisitrecordById(id);
    }
}

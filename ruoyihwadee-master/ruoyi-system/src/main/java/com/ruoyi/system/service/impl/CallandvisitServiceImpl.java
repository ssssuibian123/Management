package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CallandvisitMapper;
import com.ruoyi.system.domain.Callandvisit;
import com.ruoyi.system.service.ICallandvisitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 来电来访情况Service业务层处理
 * 
 * @author aower
 * @date 2022-02-17
 */
@Service
public class CallandvisitServiceImpl implements ICallandvisitService 
{
    @Autowired
    private CallandvisitMapper callandvisitMapper;

    /**
     * 查询来电来访情况
     * 
     * @param id 来电来访情况ID
     * @return 来电来访情况
     */
    @Override
    public Callandvisit selectCallandvisitById(Integer id)
    {
        return callandvisitMapper.selectCallandvisitById(id);
    }

    /**
     * 查询来电来访情况列表
     * 
     * @param callandvisit 来电来访情况
     * @return 来电来访情况
     */
    @Override
    public List<Callandvisit> selectCallandvisitList(Callandvisit callandvisit)
    {
        return callandvisitMapper.selectCallandvisitList(callandvisit);
    }

    /**
     * 新增来电来访情况
     * 
     * @param callandvisit 来电来访情况
     * @return 结果
     */
    @Override
    public int insertCallandvisit(Callandvisit callandvisit)
    {
        return callandvisitMapper.insertCallandvisit(callandvisit);
    }

    /**
     * 修改来电来访情况
     * 
     * @param callandvisit 来电来访情况
     * @return 结果
     */
    @Override
    public int updateCallandvisit(Callandvisit callandvisit)
    {
        return callandvisitMapper.updateCallandvisit(callandvisit);
    }

    /**
     * 删除来电来访情况对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCallandvisitByIds(String ids)
    {
        return callandvisitMapper.deleteCallandvisitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除来电来访情况信息
     * 
     * @param id 来电来访情况ID
     * @return 结果
     */
    @Override
    public int deleteCallandvisitById(Integer id)
    {
        return callandvisitMapper.deleteCallandvisitById(id);
    }
}

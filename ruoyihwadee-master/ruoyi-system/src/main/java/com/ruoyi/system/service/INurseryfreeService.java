package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Nurseryfree;

/**
 * 育婴师空闲表Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface INurseryfreeService 
{
    /**
     * 查询育婴师空闲表
     * 
     * @param id 育婴师空闲表ID
     * @return 育婴师空闲表
     */
    public Nurseryfree selectNurseryfreeById(Integer id);

    /**
     * 查询育婴师空闲表列表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 育婴师空闲表集合
     */
    public List<Nurseryfree> selectNurseryfreeList(Nurseryfree nurseryfree);

    /**
     * 新增育婴师空闲表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 结果
     */
    public int insertNurseryfree(Nurseryfree nurseryfree);

    /**
     * 修改育婴师空闲表
     * 
     * @param nurseryfree 育婴师空闲表
     * @return 结果
     */
    public int updateNurseryfree(Nurseryfree nurseryfree);

    /**
     * 批量删除育婴师空闲表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNurseryfreeByIds(String ids);

    /**
     * 删除育婴师空闲表信息
     * 
     * @param id 育婴师空闲表ID
     * @return 结果
     */
    public int deleteNurseryfreeById(Integer id);
}

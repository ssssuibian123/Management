package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Nurseryworking;

/**
 * 育婴师工作状态表Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface NurseryworkingMapper 
{
    /**
     * 查询育婴师工作状态表
     * 
     * @param id 育婴师工作状态表ID
     * @return 育婴师工作状态表
     */
    public Nurseryworking selectNurseryworkingById(Integer id);

    /**
     * 查询育婴师工作状态表列表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 育婴师工作状态表集合
     */
    public List<Nurseryworking> selectNurseryworkingList(Nurseryworking nurseryworking);

    /**
     * 新增育婴师工作状态表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 结果
     */
    public int insertNurseryworking(Nurseryworking nurseryworking);

    /**
     * 修改育婴师工作状态表
     * 
     * @param nurseryworking 育婴师工作状态表
     * @return 结果
     */
    public int updateNurseryworking(Nurseryworking nurseryworking);

    /**
     * 删除育婴师工作状态表
     * 
     * @param id 育婴师工作状态表ID
     * @return 结果
     */
    public int deleteNurseryworkingById(Integer id);

    /**
     * 批量删除育婴师工作状态表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNurseryworkingByIds(String[] ids);
}

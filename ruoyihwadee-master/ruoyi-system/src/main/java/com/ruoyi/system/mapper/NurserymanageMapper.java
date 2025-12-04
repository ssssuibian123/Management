package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Nurserymanage;

/**
 * 育婴师管理Mapper接口
 * 
 * @author aower
 * @date 2022-02-19
 */
public interface NurserymanageMapper 
{
    /**
     * 查询育婴师管理
     * 
     * @param id 育婴师管理ID
     * @return 育婴师管理
     */
    public Nurserymanage selectNurserymanageById(Integer id);

    /**
     * 查询育婴师管理列表
     * 
     * @param nurserymanage 育婴师管理
     * @return 育婴师管理集合
     */
    public List<Nurserymanage> selectNurserymanageList(Nurserymanage nurserymanage);

    /**
     * 新增育婴师管理
     * 
     * @param nurserymanage 育婴师管理
     * @return 结果
     */
    public int insertNurserymanage(Nurserymanage nurserymanage);

    /**
     * 修改育婴师管理
     * 
     * @param nurserymanage 育婴师管理
     * @return 结果
     */
    public int updateNurserymanage(Nurserymanage nurserymanage);

    /**
     * 删除育婴师管理
     * 
     * @param id 育婴师管理ID
     * @return 结果
     */
    public int deleteNurserymanageById(Integer id);

    /**
     * 批量删除育婴师管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNurserymanageByIds(String[] ids);
}

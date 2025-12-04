package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Nurseryvisitrecord;

/**
 * 育婴师回访记录Service接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface INurseryvisitrecordService 
{
    /**
     * 查询育婴师回访记录
     * 
     * @param id 育婴师回访记录ID
     * @return 育婴师回访记录
     */
    public Nurseryvisitrecord selectNurseryvisitrecordById(Long id);

    /**
     * 查询育婴师回访记录列表
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 育婴师回访记录集合
     */
    public List<Nurseryvisitrecord> selectNurseryvisitrecordList(Nurseryvisitrecord nurseryvisitrecord);

    /**
     * 新增育婴师回访记录
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 结果
     */
    public int insertNurseryvisitrecord(Nurseryvisitrecord nurseryvisitrecord);

    /**
     * 修改育婴师回访记录
     * 
     * @param nurseryvisitrecord 育婴师回访记录
     * @return 结果
     */
    public int updateNurseryvisitrecord(Nurseryvisitrecord nurseryvisitrecord);

    /**
     * 批量删除育婴师回访记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteNurseryvisitrecordByIds(String ids);

    /**
     * 删除育婴师回访记录信息
     * 
     * @param id 育婴师回访记录ID
     * @return 结果
     */
    public int deleteNurseryvisitrecordById(Long id);
}

package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ContermanBirthday;

/**
 * 员工生日提醒Mapper接口
 * 
 * @author aower
 * @date 2022-02-17
 */
public interface ContermanBirthdayMapper 
{
    /**
     * 查询员工生日提醒
     * 
     * @param contermanId 员工生日提醒ID
     * @return 员工生日提醒
     */
    public ContermanBirthday selectContermanBirthdayById(Long contermanId);

    /**
     * 查询员工生日提醒列表
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 员工生日提醒集合
     */
    public List<ContermanBirthday> selectContermanBirthdayList(ContermanBirthday contermanBirthday);

    /**
     * 新增员工生日提醒
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 结果
     */
    public int insertContermanBirthday(ContermanBirthday contermanBirthday);

    /**
     * 修改员工生日提醒
     * 
     * @param contermanBirthday 员工生日提醒
     * @return 结果
     */
    public int updateContermanBirthday(ContermanBirthday contermanBirthday);

    /**
     * 删除员工生日提醒
     * 
     * @param contermanId 员工生日提醒ID
     * @return 结果
     */
    public int deleteContermanBirthdayById(Long contermanId);

    /**
     * 批量删除员工生日提醒
     * 
     * @param contermanIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteContermanBirthdayByIds(String[] contermanIds);
}

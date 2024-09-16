package com.ruoyi.function.service;

import java.util.List;
import com.ruoyi.function.domain.LeaveMentor;

/**
 * leave_mentorService接口
 *
 * @author xiaou
 * @date 2024-09-15
 */
public interface ILeaveMentorService
{
    /**
     * 查询leave_mentor
     *
     * @param id leave_mentor主键
     * @return leave_mentor
     */
    public LeaveMentor selectLeaveMentorById(Long id);

    /**
     * 查询leave_mentor列表
     *
     * @param leaveMentor leave_mentor
     * @return leave_mentor集合
     */
    public List<LeaveMentor> selectLeaveMentorList(LeaveMentor leaveMentor);

    /**
     * 新增leave_mentor
     *
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    public int insertLeaveMentor(LeaveMentor leaveMentor);

    /**
     * 修改leave_mentor
     *
     * @param leaveMentor leave_mentor
     * @return 结果
     */
    public int updateLeaveMentor(LeaveMentor leaveMentor);

    /**
     * 批量删除leave_mentor
     *
     * @param ids 需要删除的leave_mentor主键集合
     * @return 结果
     */
    public int deleteLeaveMentorByIds(Long[] ids);

    /**
     * 删除leave_mentor信息
     *
     * @param id leave_mentor主键
     * @return 结果
     */
    public int deleteLeaveMentorById(Long id);
}

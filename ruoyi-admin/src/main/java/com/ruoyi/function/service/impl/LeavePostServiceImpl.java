package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.LeavePostMapper;
import com.ruoyi.function.domain.LeavePost;
import com.ruoyi.function.service.ILeavePostService;

/**
 * leave_postService业务层处理
 *
 * @author xiaou
 * @date 2024-09-15
 */
@Service
public class LeavePostServiceImpl implements ILeavePostService
{
    @Autowired
    private LeavePostMapper leavePostMapper;

    /**
     * 查询leave_post
     *
     * @param id leave_post主键
     * @return leave_post
     */
    @Override
    public LeavePost selectLeavePostById(Long id)
    {
        return leavePostMapper.selectLeavePostById(id);
    }

    /**
     * 查询leave_post列表
     *
     * @param leavePost leave_post
     * @return leave_post
     */
    @Override
    public List<LeavePost> selectLeavePostList(LeavePost leavePost)
    {
        return leavePostMapper.selectLeavePostList(leavePost);
    }

    /**
     * 新增leave_post
     *
     * @param leavePost leave_post
     * @return 结果
     */
    @Override
    public int insertLeavePost(LeavePost leavePost)
    {
        return leavePostMapper.insertLeavePost(leavePost);
    }

    /**
     * 修改leave_post
     *
     * @param leavePost leave_post
     * @return 结果
     */
    @Override
    public int updateLeavePost(LeavePost leavePost)
    {
        return leavePostMapper.updateLeavePost(leavePost);
    }

    /**
     * 批量删除leave_post
     *
     * @param ids 需要删除的leave_post主键
     * @return 结果
     */
    @Override
    public int deleteLeavePostByIds(Long[] ids)
    {
        return leavePostMapper.deleteLeavePostByIds(ids);
    }

    /**
     * 删除leave_post信息
     *
     * @param id leave_post主键
     * @return 结果
     */
    @Override
    public int deleteLeavePostById(Long id)
    {
        return leavePostMapper.deleteLeavePostById(id);
    }
}

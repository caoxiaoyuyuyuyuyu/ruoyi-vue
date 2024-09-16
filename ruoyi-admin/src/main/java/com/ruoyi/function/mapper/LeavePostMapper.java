package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.LeavePost;

/**
 * leave_postMapper接口
 *
 * @author xiaou
 * @date 2024-09-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface LeavePostMapper
{
    /**
     * 查询leave_post
     *
     * @param id leave_post主键
     * @return leave_post
     */
    public LeavePost selectLeavePostById(Long id);

    /**
     * 查询leave_post列表
     *
     * @param leavePost leave_post
     * @return leave_post集合
     */
    public List<LeavePost> selectLeavePostList(LeavePost leavePost);

    /**
     * 新增leave_post
     *
     * @param leavePost leave_post
     * @return 结果
     */
    public int insertLeavePost(LeavePost leavePost);

    /**
     * 修改leave_post
     *
     * @param leavePost leave_post
     * @return 结果
     */
    public int updateLeavePost(LeavePost leavePost);

    /**
     * 删除leave_post
     *
     * @param id leave_post主键
     * @return 结果
     */
    public int deleteLeavePostById(Long id);

    /**
     * 批量删除leave_post
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLeavePostByIds(Long[] ids);
}

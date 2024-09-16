package com.ruoyi.function.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.function.domain.FunUser;

/**
 * 学生信息Service接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
public interface IFunUserService 
{
    /**
     * 查询学生信息
     * 
     * @param id 学生信息主键
     * @return 学生信息
     */
    public FunUser selectFunUserById(Long id);

    /**
     * 查询学生信息列表
     * 
     * @param funUser 学生信息
     * @return 学生信息集合
     */
    public List<FunUser> selectFunUserList(FunUser funUser);

    /**
     * 新增学生信息
     * 
     * @param funUser 学生信息
     * @return 结果
     */
    public int insertFunUser(FunUser funUser);

    /**
     * 修改学生信息
     * 
     * @param funUser 学生信息
     * @return 结果
     */
    public int updateFunUser(FunUser funUser);

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的学生信息主键集合
     * @return 结果
     */
    public int deleteFunUserByIds(Long[] ids);

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息主键
     * @return 结果
     */
    public int deleteFunUserById(Long id);
    /**
     * 导入用户数据
     *
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importUser(List<FunUser> userList, Boolean isUpdateSupport);

    FunUser getUserInfo(String userId);
}

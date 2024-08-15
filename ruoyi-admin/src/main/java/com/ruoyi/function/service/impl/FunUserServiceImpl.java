package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunUserMapper;
import com.ruoyi.function.domain.FunUser;
import com.ruoyi.function.service.IFunUserService;

/**
 * 学生信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
public class FunUserServiceImpl implements IFunUserService 
{
    @Autowired
    private FunUserMapper funUserMapper;

    /**
     * 查询学生信息
     * 
     * @param id 学生信息主键
     * @return 学生信息
     */
    @Override
    public FunUser selectFunUserById(Long id)
    {
        return funUserMapper.selectFunUserById(id);
    }

    /**
     * 查询学生信息列表
     * 
     * @param funUser 学生信息
     * @return 学生信息
     */
    @Override
    public List<FunUser> selectFunUserList(FunUser funUser)
    {
        return funUserMapper.selectFunUserList(funUser);
    }

    /**
     * 新增学生信息
     * 
     * @param funUser 学生信息
     * @return 结果
     */
    @Override
    public int insertFunUser(FunUser funUser)
    {
        return funUserMapper.insertFunUser(funUser);
    }

    /**
     * 修改学生信息
     * 
     * @param funUser 学生信息
     * @return 结果
     */
    @Override
    public int updateFunUser(FunUser funUser)
    {
        return funUserMapper.updateFunUser(funUser);
    }

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的学生信息主键
     * @return 结果
     */
    @Override
    public int deleteFunUserByIds(Long[] ids)
    {
        return funUserMapper.deleteFunUserByIds(ids);
    }

    /**
     * 删除学生信息信息
     * 
     * @param id 学生信息主键
     * @return 结果
     */
    @Override
    public int deleteFunUserById(Long id)
    {
        return funUserMapper.deleteFunUserById(id);
    }
}

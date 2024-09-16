package com.ruoyi.function.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.bean.BeanValidators;
import com.ruoyi.function.config.DefaultConfig;
import com.ruoyi.system.service.impl.SysUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunUserMapper;
import com.ruoyi.function.domain.FunUser;
import com.ruoyi.function.service.IFunUserService;
import javax.validation.Validator;

/**
 * 学生信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
public class FunUserServiceImpl implements IFunUserService 
{
    private static final Logger log = LoggerFactory.getLogger(FunUserServiceImpl.class);

    @Autowired
    private FunUserMapper funUserMapper;

    @Autowired
    protected Validator validator;

    @Autowired
    private DefaultConfig config;

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


    /**
     * 导入用户数据
     *
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    @Override
    public String importUser(List<FunUser> userList, Boolean isUpdateSupport)
    {
        if (StringUtils.isNull(userList) || userList.size() == 0)
        {
            throw new ServiceException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (FunUser user : userList)
        {
            try
            {
                // 验证是否存在这个用户
                FunUser u = funUserMapper.selectFunUserByUserid(user.getUserid());
                if (StringUtils.isNull(u))
                {
                    BeanValidators.validateWithException(validator, user);
                    if(StringUtils.isEmpty(user.getPassword()))user.setPassword(config.getPassword());
                    if(StringUtils.isEmpty(user.getUserLevel()))user.setUserLevel(config.getUserLevel());
                    if(StringUtils.isEmpty(user.getUsername()))user.setUsername(user.getUserid());
                    user.setAvatarUrl(config.getAvatarUrl());
                    log.debug("插入用户" + user);
                    funUserMapper.insertFunUser(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + user.getUserid() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    BeanValidators.validateWithException(validator, user);
                    funUserMapper.updateFunUser(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + user.getUserid() + " 更新成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + user.getUserid() + " 已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + user.getUserid() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

    @Override
    public FunUser getUserInfo(String userId) {
        FunUser user = funUserMapper.selectFunUserByUserid(userId);
        if(user!=null){
            user.setPassword("");
        }
        return user;
    }

}

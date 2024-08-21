package com.ruoyi.function.mapper;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.function.domain.FunUser;

/**
 * 学生信息Mapper接口
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@DataSource(value = DataSourceType.SLAVE)
public interface FunUserMapper 
{
    /**
     * 查询学生信息
     * 
     * @param id 学生信息主键
     * @return 学生信息
     */
    public FunUser selectFunUserById(Long id);

    /**
     * 查询学生信息
     *
     * @param userid 学生信息id
     * @return 学生信息
     */
     public FunUser selectFunUserByUserid(String userid);

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
     * 删除学生信息
     * 
     * @param id 学生信息主键
     * @return 结果
     */
    public int deleteFunUserById(Long id);

    /**
     * 批量删除学生信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFunUserByIds(Long[] ids);
}

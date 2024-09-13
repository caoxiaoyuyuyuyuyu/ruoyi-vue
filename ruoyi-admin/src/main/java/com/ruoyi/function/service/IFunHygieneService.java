package com.ruoyi.function.service;

import java.util.List;
import com.ruoyi.function.domain.FunHygiene;

/**
 * 卫检成绩Service接口
 * 
 * @author xiaou
 * @date 2024-09-13
 */
public interface IFunHygieneService 
{
    /**
     * 查询卫检成绩
     * 
     * @param id 卫检成绩主键
     * @return 卫检成绩
     */
    public FunHygiene selectFunHygieneById(Long id);

    /**
     * 查询卫检成绩列表
     * 
     * @param funHygiene 卫检成绩
     * @return 卫检成绩集合
     */
    public List<FunHygiene> selectFunHygieneList(FunHygiene funHygiene);

    /**
     * 新增卫检成绩
     * 
     * @param funHygiene 卫检成绩
     * @return 结果
     */
    public int insertFunHygiene(FunHygiene funHygiene);

    /**
     * 修改卫检成绩
     * 
     * @param funHygiene 卫检成绩
     * @return 结果
     */
    public int updateFunHygiene(FunHygiene funHygiene);

    /**
     * 批量删除卫检成绩
     * 
     * @param ids 需要删除的卫检成绩主键集合
     * @return 结果
     */
    public int deleteFunHygieneByIds(Long[] ids);

    /**
     * 删除卫检成绩信息
     * 
     * @param id 卫检成绩主键
     * @return 结果
     */
    public int deleteFunHygieneById(Long id);
}

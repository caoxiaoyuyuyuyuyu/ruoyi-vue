package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunHygieneMapper;
import com.ruoyi.function.domain.FunHygiene;
import com.ruoyi.function.service.IFunHygieneService;

/**
 * 卫检成绩Service业务层处理
 * 
 * @author zhenzhen
 * @date 2024-08-28
 */
@Service
public class FunHygieneServiceImpl implements IFunHygieneService 
{
    @Autowired
    private FunHygieneMapper funHygieneMapper;

    /**
     * 查询卫检成绩
     * 
     * @param id 卫检成绩主键
     * @return 卫检成绩
     */
    @Override
    public FunHygiene selectFunHygieneById(Long id)
    {
        return funHygieneMapper.selectFunHygieneById(id);
    }

    /**
     * 查询卫检成绩列表
     * 
     * @param funHygiene 卫检成绩
     * @return 卫检成绩
     */
    @Override
    public List<FunHygiene> selectFunHygieneList(FunHygiene funHygiene)
    {
        return funHygieneMapper.selectFunHygieneList(funHygiene);
    }

    /**
     * 新增卫检成绩
     * 
     * @param funHygiene 卫检成绩
     * @return 结果
     */
    @Override
    public int insertFunHygiene(FunHygiene funHygiene)
    {
        return funHygieneMapper.insertFunHygiene(funHygiene);
    }

    /**
     * 修改卫检成绩
     * 
     * @param funHygiene 卫检成绩
     * @return 结果
     */
    @Override
    public int updateFunHygiene(FunHygiene funHygiene)
    {
        return funHygieneMapper.updateFunHygiene(funHygiene);
    }

    /**
     * 批量删除卫检成绩
     * 
     * @param ids 需要删除的卫检成绩主键
     * @return 结果
     */
    @Override
    public int deleteFunHygieneByIds(Long[] ids)
    {
        return funHygieneMapper.deleteFunHygieneByIds(ids);
    }

    /**
     * 删除卫检成绩信息
     * 
     * @param id 卫检成绩主键
     * @return 结果
     */
    @Override
    public int deleteFunHygieneById(Long id)
    {
        return funHygieneMapper.deleteFunHygieneById(id);
    }
}

package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunAdviseMapper;
import com.ruoyi.function.domain.FunAdvise;
import com.ruoyi.function.service.IFunAdviseService;

/**
 * 投诉与建议Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-20
 */
@Service
public class FunAdviseServiceImpl implements IFunAdviseService 
{
    @Autowired
    private FunAdviseMapper funAdviseMapper;

    /**
     * 查询投诉与建议
     * 
     * @param id 投诉与建议主键
     * @return 投诉与建议
     */
    @Override
    public FunAdvise selectFunAdviseById(Long id)
    {
        return funAdviseMapper.selectFunAdviseById(id);
    }

    /**
     * 查询投诉与建议列表
     * 
     * @param funAdvise 投诉与建议
     * @return 投诉与建议
     */
    @Override
    public List<FunAdvise> selectFunAdviseList(FunAdvise funAdvise)
    {
        return funAdviseMapper.selectFunAdviseList(funAdvise);
    }

    /**
     * 新增投诉与建议
     * 
     * @param funAdvise 投诉与建议
     * @return 结果
     */
    @Override
    public int insertFunAdvise(FunAdvise funAdvise)
    {
        return funAdviseMapper.insertFunAdvise(funAdvise);
    }

    /**
     * 修改投诉与建议
     * 
     * @param funAdvise 投诉与建议
     * @return 结果
     */
    @Override
    public int updateFunAdvise(FunAdvise funAdvise)
    {
        return funAdviseMapper.updateFunAdvise(funAdvise);
    }

    /**
     * 批量删除投诉与建议
     * 
     * @param ids 需要删除的投诉与建议主键
     * @return 结果
     */
    @Override
    public int deleteFunAdviseByIds(Long[] ids)
    {
        return funAdviseMapper.deleteFunAdviseByIds(ids);
    }

    /**
     * 删除投诉与建议信息
     * 
     * @param id 投诉与建议主键
     * @return 结果
     */
    @Override
    public int deleteFunAdviseById(Long id)
    {
        return funAdviseMapper.deleteFunAdviseById(id);
    }
}

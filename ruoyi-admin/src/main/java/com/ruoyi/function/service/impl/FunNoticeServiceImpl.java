package com.ruoyi.function.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.function.mapper.FunNoticeMapper;
import com.ruoyi.function.domain.FunNotice;
import com.ruoyi.function.service.IFunNoticeService;

/**
 * 学校通知Service业务层处理
 *
 * @author xiaoyu
 * @date 2024-08-14
 */
@Service
public class FunNoticeServiceImpl implements IFunNoticeService
{
    @Autowired
    private FunNoticeMapper funNoticeMapper;

    /**
     * 查询学校通知
     *
     * @param id 学校通知主键
     * @return 学校通知
     */
    @Override
    public FunNotice selectFunNoticeById(Long id)
    {
        return funNoticeMapper.selectFunNoticeById(id);
    }

    /**
     * 查询学校通知列表
     *
     * @param funNotice 学校通知
     * @return 学校通知
     */
    @Override
    public List<FunNotice> selectFunNoticeList(FunNotice funNotice)
    {
        return funNoticeMapper.selectFunNoticeList(funNotice);
    }

    /**
     * 新增学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    @Override
    public int insertFunNotice(FunNotice funNotice)
    {
        return funNoticeMapper.insertFunNotice(funNotice);
    }

    /**
     * 修改学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    @Override
    public int updateFunNotice(FunNotice funNotice)
    {
        return funNoticeMapper.updateFunNotice(funNotice);
    }

    /**
     * 批量删除学校通知
     *
     * @param ids 需要删除的学校通知主键
     * @return 结果
     */
    @Override
    public int deleteFunNoticeByIds(Long[] ids)
    {
        return funNoticeMapper.deleteFunNoticeByIds(ids);
    }

    /**
     * 删除学校通知信息
     *
     * @param id 学校通知主键
     * @return 结果
     */
    @Override
    public int deleteFunNoticeById(Long id)
    {
        return funNoticeMapper.deleteFunNoticeById(id);
    }
}

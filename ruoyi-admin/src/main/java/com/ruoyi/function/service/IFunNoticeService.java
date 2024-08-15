package com.ruoyi.function.service;

import java.util.List;
import com.ruoyi.function.domain.FunNotice;

/**
 * 学校通知Service接口
 *
 * @author xiaoyu
 * @date 2024-08-14
 */
public interface IFunNoticeService
{
    /**
     * 查询学校通知
     *
     * @param id 学校通知主键
     * @return 学校通知
     */
    public FunNotice selectFunNoticeById(Long id);

    /**
     * 查询学校通知列表
     *
     * @param funNotice 学校通知
     * @return 学校通知集合
     */
    public List<FunNotice> selectFunNoticeList(FunNotice funNotice);

    /**
     * 新增学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    public int insertFunNotice(FunNotice funNotice);

    /**
     * 修改学校通知
     *
     * @param funNotice 学校通知
     * @return 结果
     */
    public int updateFunNotice(FunNotice funNotice);

    /**
     * 批量删除学校通知
     *
     * @param ids 需要删除的学校通知主键集合
     * @return 结果
     */
    public int deleteFunNoticeByIds(Long[] ids);

    /**
     * 删除学校通知信息
     *
     * @param id 学校通知主键
     * @return 结果
     */
    public int deleteFunNoticeById(Long id);
}

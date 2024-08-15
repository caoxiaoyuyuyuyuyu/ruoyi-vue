package com.ruoyi.schoolInfo.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.schoolInfo.mapper.ClassInfoMapper;
import com.ruoyi.schoolInfo.domain.ClassInfo;
import com.ruoyi.schoolInfo.service.IClassInfoService;

/**
 * 班级信息Service业务层处理
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class ClassInfoServiceImpl implements IClassInfoService 
{
    @Autowired
    private ClassInfoMapper classInfoMapper;

    /**
     * 查询班级信息
     * 
     * @param classId 班级信息主键
     * @return 班级信息
     */
    @Override
    public ClassInfo selectClassInfoByClassId(Long classId)
    {
        return classInfoMapper.selectClassInfoByClassId(classId);
    }

    /**
     * 查询班级信息列表
     * 
     * @param classInfo 班级信息
     * @return 班级信息
     */
    @Override
    public List<ClassInfo> selectClassInfoList(ClassInfo classInfo)
    {
        return classInfoMapper.selectClassInfoList(classInfo);
    }

    /**
     * 新增班级信息
     * 
     * @param classInfo 班级信息
     * @return 结果
     */
    @Override
    public int insertClassInfo(ClassInfo classInfo)
    {
        return classInfoMapper.insertClassInfo(classInfo);
    }

    /**
     * 修改班级信息
     * 
     * @param classInfo 班级信息
     * @return 结果
     */
    @Override
    public int updateClassInfo(ClassInfo classInfo)
    {
        return classInfoMapper.updateClassInfo(classInfo);
    }

    /**
     * 批量删除班级信息
     * 
     * @param classIds 需要删除的班级信息主键
     * @return 结果
     */
    @Override
    public int deleteClassInfoByClassIds(Long[] classIds)
    {
        return classInfoMapper.deleteClassInfoByClassIds(classIds);
    }

    /**
     * 删除班级信息信息
     * 
     * @param classId 班级信息主键
     * @return 结果
     */
    @Override
    public int deleteClassInfoByClassId(Long classId)
    {
        return classInfoMapper.deleteClassInfoByClassId(classId);
    }
}

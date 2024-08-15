package com.ruoyi.schoolInfo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.schoolInfo.domain.ClassInfo;
import com.ruoyi.schoolInfo.service.IClassInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班级信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/schoolInfo/fun_classInfo")
public class ClassInfoController extends BaseController
{
    @Autowired
    private IClassInfoService classInfoService;

    /**
     * 查询班级信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(ClassInfo classInfo)
    {
        startPage();
        List<ClassInfo> list = classInfoService.selectClassInfoList(classInfo);
        return getDataTable(list);
    }

    /**
     * 导出班级信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:export')")
    @Log(title = "班级信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ClassInfo classInfo)
    {
        List<ClassInfo> list = classInfoService.selectClassInfoList(classInfo);
        ExcelUtil<ClassInfo> util = new ExcelUtil<ClassInfo>(ClassInfo.class);
        util.exportExcel(response, list, "班级信息数据");
    }

    /**
     * 获取班级信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:query')")
    @GetMapping(value = "/{classId}")
    public AjaxResult getInfo(@PathVariable("classId") Long classId)
    {
        return success(classInfoService.selectClassInfoByClassId(classId));
    }

    /**
     * 新增班级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:add')")
    @Log(title = "班级信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ClassInfo classInfo)
    {
        return toAjax(classInfoService.insertClassInfo(classInfo));
    }

    /**
     * 修改班级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:edit')")
    @Log(title = "班级信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ClassInfo classInfo)
    {
        return toAjax(classInfoService.updateClassInfo(classInfo));
    }

    /**
     * 删除班级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_classInfo:remove')")
    @Log(title = "班级信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classIds}")
    public AjaxResult remove(@PathVariable Long[] classIds)
    {
        return toAjax(classInfoService.deleteClassInfoByClassIds(classIds));
    }
}

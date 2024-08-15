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
import com.ruoyi.schoolInfo.domain.GradeInfo;
import com.ruoyi.schoolInfo.service.IGradeInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 年级信息Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/schoolInfo/fun_gradeInfo")
public class GradeInfoController extends BaseController
{
    @Autowired
    private IGradeInfoService gradeInfoService;

    /**
     * 查询年级信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(GradeInfo gradeInfo)
    {
        startPage();
        List<GradeInfo> list = gradeInfoService.selectGradeInfoList(gradeInfo);
        return getDataTable(list);
    }

    /**
     * 导出年级信息列表
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:export')")
    @Log(title = "年级信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GradeInfo gradeInfo)
    {
        List<GradeInfo> list = gradeInfoService.selectGradeInfoList(gradeInfo);
        ExcelUtil<GradeInfo> util = new ExcelUtil<GradeInfo>(GradeInfo.class);
        util.exportExcel(response, list, "年级信息数据");
    }

    /**
     * 获取年级信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:query')")
    @GetMapping(value = "/{gradeId}")
    public AjaxResult getInfo(@PathVariable("gradeId") Long gradeId)
    {
        return success(gradeInfoService.selectGradeInfoByGradeId(gradeId));
    }

    /**
     * 新增年级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:add')")
    @Log(title = "年级信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GradeInfo gradeInfo)
    {
        return toAjax(gradeInfoService.insertGradeInfo(gradeInfo));
    }

    /**
     * 修改年级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:edit')")
    @Log(title = "年级信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GradeInfo gradeInfo)
    {
        return toAjax(gradeInfoService.updateGradeInfo(gradeInfo));
    }

    /**
     * 删除年级信息
     */
    @PreAuthorize("@ss.hasPermi('schoolInfo:fun_gradeInfo:remove')")
    @Log(title = "年级信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{gradeIds}")
    public AjaxResult remove(@PathVariable Long[] gradeIds)
    {
        return toAjax(gradeInfoService.deleteGradeInfoByGradeIds(gradeIds));
    }
}

package com.ruoyi.function.controller;

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
import com.ruoyi.function.domain.FunHygiene;
import com.ruoyi.function.service.IFunHygieneService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卫检成绩Controller
 * 
 * @author xiaou
 * @date 2024-09-13
 */
@RestController
@RequestMapping("/function/fun_hygiene")
public class FunHygieneController extends BaseController
{
    @Autowired
    private IFunHygieneService funHygieneService;

    /**
     * 查询卫检成绩列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunHygiene funHygiene)
    {
        startPage();
        List<FunHygiene> list = funHygieneService.selectFunHygieneList(funHygiene);
        return getDataTable(list);
    }

    /**
     * 导出卫检成绩列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:export')")
    @Log(title = "卫检成绩", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunHygiene funHygiene)
    {
        List<FunHygiene> list = funHygieneService.selectFunHygieneList(funHygiene);
        ExcelUtil<FunHygiene> util = new ExcelUtil<FunHygiene>(FunHygiene.class);
        util.exportExcel(response, list, "卫检成绩数据");
    }

    /**
     * 获取卫检成绩详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funHygieneService.selectFunHygieneById(id));
    }

    /**
     * 新增卫检成绩
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:add')")
    @Log(title = "卫检成绩", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunHygiene funHygiene)
    {
        return toAjax(funHygieneService.insertFunHygiene(funHygiene));
    }

    /**
     * 修改卫检成绩
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:edit')")
    @Log(title = "卫检成绩", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunHygiene funHygiene)
    {
        return toAjax(funHygieneService.updateFunHygiene(funHygiene));
    }

    /**
     * 删除卫检成绩
     */
    @PreAuthorize("@ss.hasPermi('function:fun_hygiene:remove')")
    @Log(title = "卫检成绩", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funHygieneService.deleteFunHygieneByIds(ids));
    }
}

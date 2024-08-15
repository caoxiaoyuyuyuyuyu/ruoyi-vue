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
import com.ruoyi.function.domain.FunAdvise;
import com.ruoyi.function.service.IFunAdviseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 投诉与建议Controller
 * 
 * @author xiaoyu
 * @date 2024-08-15
 */
@RestController
@RequestMapping("/function/fun_advise")
public class FunAdviseController extends BaseController
{
    @Autowired
    private IFunAdviseService funAdviseService;

    /**
     * 查询投诉与建议列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunAdvise funAdvise)
    {
        startPage();
        List<FunAdvise> list = funAdviseService.selectFunAdviseList(funAdvise);
        return getDataTable(list);
    }

    /**
     * 导出投诉与建议列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:export')")
    @Log(title = "投诉与建议", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunAdvise funAdvise)
    {
        List<FunAdvise> list = funAdviseService.selectFunAdviseList(funAdvise);
        ExcelUtil<FunAdvise> util = new ExcelUtil<FunAdvise>(FunAdvise.class);
        util.exportExcel(response, list, "投诉与建议数据");
    }

    /**
     * 获取投诉与建议详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funAdviseService.selectFunAdviseById(id));
    }

    /**
     * 新增投诉与建议
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:add')")
    @Log(title = "投诉与建议", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunAdvise funAdvise)
    {
        return toAjax(funAdviseService.insertFunAdvise(funAdvise));
    }

    /**
     * 修改投诉与建议
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:edit')")
    @Log(title = "投诉与建议", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunAdvise funAdvise)
    {
        return toAjax(funAdviseService.updateFunAdvise(funAdvise));
    }

    /**
     * 删除投诉与建议
     */
    @PreAuthorize("@ss.hasPermi('function:fun_advise:remove')")
    @Log(title = "投诉与建议", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funAdviseService.deleteFunAdviseByIds(ids));
    }
}

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
import com.ruoyi.function.domain.FunNotice;
import com.ruoyi.function.service.IFunNoticeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学校通知Controller
 *
 * @author xiaoyu
 * @date 2024-08-14
 */
@RestController
@RequestMapping("/function/fun_notice")
public class FunNoticeController extends BaseController
{
    @Autowired
    private IFunNoticeService funNoticeService;

    /**
     * 查询学校通知列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunNotice funNotice)
    {
        startPage();
        List<FunNotice> list = funNoticeService.selectFunNoticeList(funNotice);
        return getDataTable(list);
    }

    /**
     * 导出学校通知列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:export')")
    @Log(title = "学校通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunNotice funNotice)
    {
        List<FunNotice> list = funNoticeService.selectFunNoticeList(funNotice);
        ExcelUtil<FunNotice> util = new ExcelUtil<FunNotice>(FunNotice.class);
        util.exportExcel(response, list, "学校通知数据");
    }

    /**
     * 获取学校通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funNoticeService.selectFunNoticeById(id));
    }

    /**
     * 新增学校通知
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:add')")
    @Log(title = "学校通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunNotice funNotice)
    {
        return toAjax(funNoticeService.insertFunNotice(funNotice));
    }

    /**
     * 修改学校通知
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:edit')")
    @Log(title = "学校通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunNotice funNotice)
    {
        return toAjax(funNoticeService.updateFunNotice(funNotice));
    }

    /**
     * 删除学校通知
     */
    @PreAuthorize("@ss.hasPermi('function:fun_notice:remove')")
    @Log(title = "学校通知", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funNoticeService.deleteFunNoticeByIds(ids));
    }
}

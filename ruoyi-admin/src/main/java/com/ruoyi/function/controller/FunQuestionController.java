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
import com.ruoyi.function.domain.FunQuestion;
import com.ruoyi.function.service.IFunQuestionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问卷中的问题Controller
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@RestController
@RequestMapping("/function/fun_question")
public class FunQuestionController extends BaseController
{
    @Autowired
    private IFunQuestionService funQuestionService;

    /**
     * 查询问卷中的问题列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunQuestion funQuestion)
    {
        startPage();
        List<FunQuestion> list = funQuestionService.selectFunQuestionList(funQuestion);
        return getDataTable(list);
    }

    /**
     * 导出问卷中的问题列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:export')")
    @Log(title = "问卷中的问题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunQuestion funQuestion)
    {
        List<FunQuestion> list = funQuestionService.selectFunQuestionList(funQuestion);
        ExcelUtil<FunQuestion> util = new ExcelUtil<FunQuestion>(FunQuestion.class);
        util.exportExcel(response, list, "问卷中的问题数据");
    }

    /**
     * 获取问卷中的问题详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funQuestionService.selectFunQuestionById(id));
    }

    /**
     * 新增问卷中的问题
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:add')")
    @Log(title = "问卷中的问题", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunQuestion funQuestion)
    {
        return toAjax(funQuestionService.insertFunQuestion(funQuestion));
    }

    /**
     * 修改问卷中的问题
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:edit')")
    @Log(title = "问卷中的问题", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunQuestion funQuestion)
    {
        return toAjax(funQuestionService.updateFunQuestion(funQuestion));
    }

    /**
     * 删除问卷中的问题
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question:remove')")
    @Log(title = "问卷中的问题", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funQuestionService.deleteFunQuestionByIds(ids));
    }
}

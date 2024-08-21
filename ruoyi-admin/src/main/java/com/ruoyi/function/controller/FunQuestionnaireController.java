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
import com.ruoyi.function.domain.FunQuestionnaire;
import com.ruoyi.function.service.IFunQuestionnaireService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问卷Controller
 * 
 * @author xiaou
 * @date 2024-08-21
 */
@RestController
@RequestMapping("/function/fun_questionnaire")
public class FunQuestionnaireController extends BaseController
{
    @Autowired
    private IFunQuestionnaireService funQuestionnaireService;

    /**
     * 查询问卷列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:list')")
    @GetMapping("/list")
    public TableDataInfo list(FunQuestionnaire funQuestionnaire)
    {
        startPage();
        List<FunQuestionnaire> list = funQuestionnaireService.selectFunQuestionnaireList(funQuestionnaire);
        return getDataTable(list);
    }

    /**
     * 导出问卷列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:export')")
    @Log(title = "问卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FunQuestionnaire funQuestionnaire)
    {
        List<FunQuestionnaire> list = funQuestionnaireService.selectFunQuestionnaireList(funQuestionnaire);
        ExcelUtil<FunQuestionnaire> util = new ExcelUtil<FunQuestionnaire>(FunQuestionnaire.class);
        util.exportExcel(response, list, "问卷数据");
    }

    /**
     * 获取问卷详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(funQuestionnaireService.selectFunQuestionnaireById(id));
    }

    /**
     * 新增问卷
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:add')")
    @Log(title = "问卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FunQuestionnaire funQuestionnaire)
    {
        return toAjax(funQuestionnaireService.insertFunQuestionnaire(funQuestionnaire));
    }

    /**
     * 修改问卷
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:edit')")
    @Log(title = "问卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FunQuestionnaire funQuestionnaire)
    {
        return toAjax(funQuestionnaireService.updateFunQuestionnaire(funQuestionnaire));
    }

    /**
     * 删除问卷
     */
    @PreAuthorize("@ss.hasPermi('function:fun_questionnaire:remove')")
    @Log(title = "问卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(funQuestionnaireService.deleteFunQuestionnaireByIds(ids));
    }
}

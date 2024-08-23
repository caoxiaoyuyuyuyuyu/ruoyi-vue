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
import com.ruoyi.function.domain.QuesAnswerStatistics;
import com.ruoyi.function.service.IQuesAnswerStatisticsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 问卷作答统计Controller
 * 
 * @author xiaou
 * @date 2024-08-22
 */
@RestController
@RequestMapping("/function/fun_question_statistics")
public class QuesAnswerStatisticsController extends BaseController
{
    @Autowired
    private IQuesAnswerStatisticsService quesAnswerStatisticsService;

    /**
     * 查询问卷作答统计列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:list')")
    @GetMapping("/list")
    public TableDataInfo list(QuesAnswerStatistics quesAnswerStatistics)
    {
        startPage();
        List<QuesAnswerStatistics> list = quesAnswerStatisticsService.selectQuesAnswerStatisticsList(quesAnswerStatistics);
        return getDataTable(list);
    }

    /**
     * 查询问卷作答统计列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:chart')")
    @GetMapping("/chart/{id}")
    public AjaxResult list(@PathVariable("id") Long id)
    {
        logger.debug("单个问卷list统计数据");
//        startPage();
        QuesAnswerStatistics quesAnswerStatistics = new QuesAnswerStatistics();
        quesAnswerStatistics.setNaireId(id);
        List<QuesAnswerStatistics> list = quesAnswerStatisticsService.selectQuesAnswerStatisticsList(quesAnswerStatistics);
//        return getDataTable(list);
        return success(list);
    }

    /**
     * 导出问卷作答统计列表
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:export')")
    @Log(title = "问卷作答统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QuesAnswerStatistics quesAnswerStatistics)
    {
        List<QuesAnswerStatistics> list = quesAnswerStatisticsService.selectQuesAnswerStatisticsList(quesAnswerStatistics);
        ExcelUtil<QuesAnswerStatistics> util = new ExcelUtil<QuesAnswerStatistics>(QuesAnswerStatistics.class);
        util.exportExcel(response, list, "问卷作答统计数据");
    }

    /**
     * 获取问卷作答统计详细信息
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(quesAnswerStatisticsService.selectQuesAnswerStatisticsById(id));
    }

    /**
     * 新增问卷作答统计
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:add')")
    @Log(title = "问卷作答统计", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QuesAnswerStatistics quesAnswerStatistics)
    {
        return toAjax(quesAnswerStatisticsService.insertQuesAnswerStatistics(quesAnswerStatistics));
    }

    /**
     * 修改问卷作答统计
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:edit')")
    @Log(title = "问卷作答统计", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QuesAnswerStatistics quesAnswerStatistics)
    {
        return toAjax(quesAnswerStatisticsService.updateQuesAnswerStatistics(quesAnswerStatistics));
    }

    /**
     * 删除问卷作答统计
     */
    @PreAuthorize("@ss.hasPermi('function:fun_question_statistics:remove')")
    @Log(title = "问卷作答统计", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(quesAnswerStatisticsService.deleteQuesAnswerStatisticsByIds(ids));
    }
}

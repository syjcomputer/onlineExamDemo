package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ExamPlanInfo;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName: ExamPlanInfoRes
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */
public interface ExamPlanInfoRes {
    public List<ExamPlanInfo> getExamPlans(Map<String, Object> map);

    public int isAddExamPlan(ExamPlanInfo examPlan);

    public int isUpdateExamPlan(ExamPlanInfo examPlan);

    public ExamPlanInfo getExamPlanById(int examPlanId);

    //查询学生待考信息
    public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map);

    public int isRemoveExamPlan(int examPlanId);
}

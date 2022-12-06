package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ExamPlanInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamPlanInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamPlanInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 19:45
 * @version: 1.0
 */
@Repository
public class ExamPlanInfoResImpl implements ExamPlanInfoRes {

    @Autowired
    ExamPlanInfoMapper planInfoMapper;

    @Override
    public List<ExamPlanInfo> getExamPlans(Map<String, Object> map){
        return planInfoMapper.getExamPlans(map);
    }

    @Override
    public int isAddExamPlan(ExamPlanInfo examPlan){
        return planInfoMapper.isAddExamPlan(examPlan);
    }

    @Override
    public int isUpdateExamPlan(ExamPlanInfo examPlan){
        return planInfoMapper.isUpdateExamPlan(examPlan);
    }

    @Override
    public ExamPlanInfo getExamPlanById(int examPlanId){
        return planInfoMapper.getExamPlanById(examPlanId);
    }

    @Override
    //查询学生待考信息
    public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map){
        return planInfoMapper.getStudentWillExam(map);
    }

    @Override
    public int isRemoveExamPlan(int examPlanId){
        return planInfoMapper.isRemoveExamPlan(examPlanId);
    }
}

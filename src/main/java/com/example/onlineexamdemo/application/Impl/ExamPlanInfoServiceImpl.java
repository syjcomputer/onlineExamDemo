package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.ExamPlanInfoService;
import com.example.onlineexamdemo.infrastructure.ExamPlanInfoRes;
import com.example.onlineexamdemo.infrastructure.po.ExamPlanInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamPlanInfoServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class ExamPlanInfoServiceImpl implements ExamPlanInfoService {

	@Autowired
	private ExamPlanInfoRes examPlanInfoMapper;

	@Override
	public List<ExamPlanInfo> getExamPlans(Map<String, Object> map) {
		return examPlanInfoMapper.getExamPlans(map);
	}

	@Override
	public int isAddExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isAddExamPlan(examPlan);
	}

	@Override
	public int isUpdateExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isUpdateExamPlan(examPlan);
	}

	@Override
	public ExamPlanInfo getExamPlanById(int examPlanId) {
		return examPlanInfoMapper.getExamPlanById(examPlanId);
	}

	@Override
	//查询学生待考信息
	public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map) {
		return examPlanInfoMapper.getStudentWillExam(map);
	}

	@Override
	//移除过期考试安排
	public int isRemoveExamPlan(int examPlanId) {
		return examPlanInfoMapper.isRemoveExamPlan(examPlanId);
	}

}

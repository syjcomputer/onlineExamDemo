package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.ExamPlanInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamPlanInfoMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */
@Mapper
public interface ExamPlanInfoMapper {

	public List<ExamPlanInfo> getExamPlans(Map<String, Object> map);
	
	public int isAddExamPlan(ExamPlanInfo examPlan);

	public int isUpdateExamPlan(ExamPlanInfo examPlan);
	
	public ExamPlanInfo getExamPlanById(@Param("examPlanId") int examPlanId);
	
	//查询学生待考信息
	public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map);
	
	public int isRemoveExamPlan(@Param("examPlanId") int examPlanId);
}

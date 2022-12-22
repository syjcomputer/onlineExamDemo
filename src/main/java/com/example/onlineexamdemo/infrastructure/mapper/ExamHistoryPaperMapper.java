package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamHistoryPaperMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Mapper
public interface ExamHistoryPaperMapper {

	//查询考试历史信息，针对前台学生查询
	public List<ExamHistoryPaper> getExamHistoryToStudent(@Param("studentId") int studentId);
	
	public int isAddExamHistory(Map<String, Object> map);
	
	public int getHistoryInfoWithIds(Map<String, Object> map);
	
	//查询考试历史信息，针对后台教师查询
	public List<ExamHistoryInfo> getExamHistoryToTeacher();
}

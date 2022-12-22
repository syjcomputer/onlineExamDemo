package com.example.onlineexamdemo.application;

import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryPaper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamHistoryPaperService</p>
  * <p>Description: </p>
  * @version: 1.0
  */

public interface ExamHistoryPaperService {

	//查询考试历史信息，针对前台学生查询
	public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId);
	
	public int isAddExamHistory(Map<String, Object> map);
	
	public int getHistoryInfoWithIds(Map<String, Object> map);
	
	public List<ExamHistoryInfo> getExamHistoryToTeacher();
}

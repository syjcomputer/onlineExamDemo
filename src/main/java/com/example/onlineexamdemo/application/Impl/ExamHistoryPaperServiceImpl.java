package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.ExamHistoryPaperService;
import com.example.onlineexamdemo.infrastructure.ExamHistoryPaperInfoRes;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamHistoryPaperServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class ExamHistoryPaperServiceImpl implements ExamHistoryPaperService {

	@Autowired
	private ExamHistoryPaperInfoRes examHistoryPaperMapper;

	@Override
	public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId) {
		return examHistoryPaperMapper.getExamHistoryToStudent(studentId);
	}

	@Override
	public int isAddExamHistory(Map<String, Object> map) {
		return examHistoryPaperMapper.isAddExamHistory(map);
	}

	@Override
	public int getHistoryInfoWithIds(Map<String, Object> map) {
		return examHistoryPaperMapper.getHistoryInfoWithIds(map);
	}

	@Override
	public List<ExamHistoryInfo> getExamHistoryToTeacher() {
		return examHistoryPaperMapper.getExamHistoryToTeacher();
	}

}

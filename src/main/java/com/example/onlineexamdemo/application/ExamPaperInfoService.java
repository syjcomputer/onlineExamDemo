package com.example.onlineexamdemo.application;


import com.example.onlineexamdemo.infrastructure.po.ExamPaperInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamPaperInfoService</p>
  * <p>Description: </p>
  * @version: 1.0
  */

public interface ExamPaperInfoService {

	public List<ExamPaperInfo> getExamPapers(Map<String, Object> map);

	public ExamPaperInfo getExamPaper(int examPaperId);
	
	public List<ExamPaperInfo> getExamPapersClear();

	public int isAddExamPaper(ExamPaperInfo examPaper);

	public int isUpdateExamPaper(ExamPaperInfo examPaper);

	public int isDelExamPaper(int examPaperId);
	
	public int getExamPpaerTotal();
	
	public int isUpdateExamPaperSubjects(Map<String, Object> map);
	
	public int isUpdateExamPaperScore(Map<String, Object> map);
}

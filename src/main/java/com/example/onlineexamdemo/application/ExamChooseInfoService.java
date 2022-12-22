package com.example.onlineexamdemo.application;

import com.example.onlineexamdemo.infrastructure.po.ExamChooseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamChooseInfoService</p>
  * <p>Description: </p>
  * @version: 1.0
  */

public interface ExamChooseInfoService {

	public ExamChooseInfo getChooseWithIds(Map<String, Object> map);

	public int updateChooseWithIds(ExamChooseInfo examChoose);
	
	public int addChoose(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}

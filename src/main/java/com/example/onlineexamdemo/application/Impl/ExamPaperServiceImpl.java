package com.example.onlineexamdemo.application.Impl;


import com.example.onlineexamdemo.application.ExamPaperInfoService;
import com.example.onlineexamdemo.infrastructure.ExamPaperInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamPaperInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamPaperInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamPaperServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class ExamPaperServiceImpl implements ExamPaperInfoService {
	
	@Autowired
	private ExamPaperInfoRes examPaperInfoMapper;
	
	//private Logger logger = Logger.getLogger(ExamPaperServiceImpl.class);

	@Override
	public List<ExamPaperInfo> getExamPapers(Map<String, Object> map) {
		return examPaperInfoMapper.getExamPapers(map);
	}

	@Override
	public ExamPaperInfo getExamPaper(int examPaperId) {
		return examPaperInfoMapper.getExamPaperById(examPaperId);
	}

	@Override
	public int isAddExamPaper(ExamPaperInfo examPaper) {
		return examPaperInfoMapper.isAddExamPaper(examPaper);
	}

	@Override
	public int isUpdateExamPaper(ExamPaperInfo examPaper) {
		return examPaperInfoMapper.isUpdateExamPaper(examPaper);
	}

	@Override
	public int isDelExamPaper(int examPaperId) {
		return examPaperInfoMapper.isDelExamPaper(examPaperId);
	}

	@Override
	public int getExamPpaerTotal() {
		return examPaperInfoMapper.getExamPpaerTotal();
	}

	@Override
	public int isUpdateExamPaperSubjects(Map<String, Object> map) {
		//logger.info("修改试卷 "+map.get("examPaperId")+"的题目数量，变动数量："+map.get("subjectNum"));
		return examPaperInfoMapper.isUpdateExamPaperSubjects(map);
	}

	@Override
	public int isUpdateExamPaperScore(Map<String, Object> map) {
		//logger.info("修改试卷 "+map.get("examPaperId")+"的总分，变动分值："+map.get("score"));
		return examPaperInfoMapper.isUpdateExamPaperScore(map);
	}

	@Override
	public List<ExamPaperInfo> getExamPapersClear() {
		return examPaperInfoMapper.getExamPapersClear();
	}

}

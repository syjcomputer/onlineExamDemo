package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.ExamSubjectMiddleInfoService;
import com.example.onlineexamdemo.infrastructure.ExamSubjectMiddleInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamSubjectMiddleInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamSubjectMiddleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamSubjectMiddleInfoServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class ExamSubjectMiddleInfoServiceImpl implements
		ExamSubjectMiddleInfoService {

	@Autowired
	private ExamSubjectMiddleInfoRes examSubjectMiddleInfoMapper;

	@Override
	//查询试卷-试题信息
	public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(
			ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getExamPaperWithSubject(esm);
	}

	@Override
	public int isAddESM(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.isAddESM(map);
	}

	@Override
	public int removeSubjectWithExamPaper(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.removeSubjectWithExamPaper(map);
	}

	@Override
	public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getEsmByExamIdWithSubjectId(esm);
	}

}

package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.ExamChooseInfoService;
import com.example.onlineexamdemo.infrastructure.ExamChooseInfoRes;
import com.example.onlineexamdemo.infrastructure.po.ExamChooseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamChooseInfoServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class ExamChooseInfoServiceImpl implements ExamChooseInfoService {

	@Autowired
	private ExamChooseInfoRes examChooseInfoMapper;

	@Override
	//根据学生编号，试卷编号，试题编号获取选择记录
	public ExamChooseInfo getChooseWithIds(Map<String, Object> map) {
		return examChooseInfoMapper.getChooseWithIds(map);
	}

	@Override
	//修改选择记录
	public int updateChooseWithIds(ExamChooseInfo examChoose) {
		return examChooseInfoMapper.updateChooseWithIds(examChoose);
	}

	@Override
	//添加选择记录
	public int addChoose(Map<String, Object> map) {
		return examChooseInfoMapper.addChoose(map);
	}

	@Override
	public List<ExamChooseInfo> getChooseInfoWithSumScore(
			Map<String, Object> map) {
		return examChooseInfoMapper.getChooseInfoWithSumScore(map);
	}

	@Override
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(
			Map<String, Object> map) {
		return examChooseInfoMapper.getChooseInfoWithExamSubject(map);
	}


}

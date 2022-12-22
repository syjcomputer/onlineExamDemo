package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.ExamChooseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: ExamChooseInfoMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Mapper
public interface ExamChooseInfoMapper {

	public ExamChooseInfo getChooseWithIds(Map<String, Object> map);
	
	public int updateChooseWithIds(ExamChooseInfo examChoose);
	
	public int addChoose(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);
	
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}

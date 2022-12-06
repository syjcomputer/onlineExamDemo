package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.GradeInfoService;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import com.example.onlineexamdemo.infrastructure.GradeInfoRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
  *
  * <p>Title: GradeInfoServiceImpl</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Service
public class GradeInfoServiceImpl implements GradeInfoService {

	@Autowired
	private GradeInfoRes gradeInfoRes;
	
	public List<GradeInfo> getGrades() {
		return gradeInfoRes.getGrades();
	}

	public int isAddGrade(GradeInfo grade) {
		return gradeInfoRes.isAddGrade(grade);
	}

	public int isDelGrade(int gradeId) {
		return gradeInfoRes.isDelGrade(gradeId);
	}

	public int isUpdateGrade(GradeInfo grade) {
		return gradeInfoRes.isUpdateGrade(grade);
	}

	public GradeInfo getGradeById(int gradeId) {
		return gradeInfoRes.getGradeById(gradeId);
	}

}

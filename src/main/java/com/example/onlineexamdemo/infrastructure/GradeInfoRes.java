package com.example.onlineexamdemo.infrastructure;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
  *
  * <p>Title: GradeInfoMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */

public interface GradeInfoMapper {

	//获取所有年级
	public List<GradeInfo> getGrades();
	
	//根据编号获取年级
	public GradeInfo getGradeById(int gradeId);
	
	//添加年级
	public int isAddGrade(GradeInfo grade);
	
	//删除年级
	public int isDelGrade(int gradeId);
	
	//修改年级
	public int isUpdateGrade(GradeInfo grade);
}

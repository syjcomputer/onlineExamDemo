package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.StudentInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
  *
  * <p>Title: StudentInfoMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Mapper
public interface StudentInfoMapper {

	public List<StudentInfo> getStudents(Map<String, Object> map);
	
	public StudentInfo getStudentById(int studentId);
	
	public int isUpdateStudent(StudentInfo student);
	
	public int isDelStudent(int studentId);
	
	public int isAddStudent(StudentInfo student);
	
	public int getStudentTotal();
	
	public StudentInfo getStudentByAccountAndPwd(String studentAccount);
	
	public int isResetPwdWithStu(StudentInfo studentInfo);
	
	public List<StudentInfo> getStudentsByClassId(int classId);
}

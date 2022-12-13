package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.CourseInfo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
  *
  * <p>Title: CourseInfoMapper</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Mapper
public interface CourseInfoMapper {

	public List<CourseInfo> getCourses(CourseInfo course);
	
	public int isUpdateCourse(CourseInfo course);

	public int isAddCourse(CourseInfo course);
	
	public int isDelCourse(int courseId);
	
	public CourseInfo getCourseById(int courseId);
}

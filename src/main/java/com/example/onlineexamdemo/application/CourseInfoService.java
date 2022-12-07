package com.example.onlineexamdemo.application;

import com.example.onlineexamdemo.infrastructure.po.CourseInfo;

import java.util.List;

public interface CourseInfoService {
    public List<CourseInfo> getCourses(CourseInfo course);

    public int isUpdateCourse(CourseInfo course);

    public int isAddCourse(CourseInfo course);

    public int isDelCourse(int courseId);

    public CourseInfo getCourseById(int courseId);


}

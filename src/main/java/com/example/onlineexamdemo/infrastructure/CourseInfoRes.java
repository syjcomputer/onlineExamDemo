package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.CourseInfo;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;

import java.util.List;

public interface CourseInfoRes {
    public List<CourseInfo> getCourses(CourseInfo course);

    public int isUpdateCourse(CourseInfo course);

    public int isAddCourse(CourseInfo course);

    public int isDelCourse(int courseId);

    public CourseInfo getCourseById(int courseId);


}

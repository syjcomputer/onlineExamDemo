package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.CourseInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.CourseInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseInfoResImpl implements CourseInfoRes {
    @Autowired
    CourseInfoMapper mapper;

    @Override
    public List<CourseInfo> getCourses(CourseInfo course) {
        return mapper.getCourses(course);
    }

    @Override
    public int isUpdateCourse(CourseInfo course) {
        return mapper.isUpdateCourse(course);
    }

    @Override
    public int isAddCourse(CourseInfo course) {
        return mapper.isAddCourse(course);
    }

    @Override
    public int isDelCourse(int courseId) {
        return mapper.isDelCourse(courseId);
    }

    @Override
    public CourseInfo getCourseById(int courseId) {
        return mapper.getCourseById(courseId);
    }
}

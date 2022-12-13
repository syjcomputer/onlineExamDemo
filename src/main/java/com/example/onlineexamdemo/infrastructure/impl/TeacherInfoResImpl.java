package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.TeacherInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.TeacherInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class TeacherInfoResImpl implements TeacherInfoRes {
    @Autowired
    TeacherInfoMapper mapper;
    @Override
    public List<TeacherInfo> getTeachers(Map<String, Object> map) {
        return mapper.getTeachers(map);
    }

    @Override
    public TeacherInfo getTeacherByAccount(String teacherAccount) {
        return mapper.getTeacherByAccount(teacherAccount);
    }

    @Override
    public int getTeacherTotal() {
        return mapper.getTeacherTotal();
    }

    @Override
    public int updateTeacherIsWork(TeacherInfo teacherInfo) {
        return mapper.updateTeacherIsWork(teacherInfo);
    }

    @Override
    public TeacherInfo getTeacherById(int teacherId) {
        return mapper.getTeacherById(teacherId);
    }

    @Override
    public int isUpdateTeacherInfo(TeacherInfo teacher) {
        return mapper.isUpdateTeacherInfo(teacher);
    }

    @Override
    public int isAddTeacherInfo(TeacherInfo teacher) {
        return mapper.isAddTeacherInfo(teacher);
    }

    @Override
    public int isDelTeacherInfo(int teacherId) {
        return mapper.isDelTeacherInfo(teacherId);
    }
}

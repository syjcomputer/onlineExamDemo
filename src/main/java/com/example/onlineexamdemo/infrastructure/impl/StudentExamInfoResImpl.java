package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.StudentExamInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.StudentExamInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.StudentExamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentExamInfoResImpl implements StudentExamInfoRes {
    @Autowired
    StudentExamInfoMapper mapper;
    @Override
    public List<StudentExamInfo> getStudentExamCountByClassId(int classId) {
        return mapper.getStudentExamCountByClassId(classId);
    }

    @Override
    public List<StudentExamInfo> getStudentExamInfo(int studentId) {
        return mapper.getStudentExamInfo(studentId);
    }

    @Override
    public List<StudentExamInfo> getAllStudentAvgScoreCount(int classId) {
        return mapper.getAllStudentAvgScoreCount(classId);

    }
}

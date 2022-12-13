package com.example.onlineexamdemo.application.Impl;

import com.example.onlineexamdemo.application.StudentExamInfoService;
import com.example.onlineexamdemo.infrastructure.StudentExamInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.StudentExamInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.StudentExamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentExamInfoServiceImpl implements StudentExamInfoService {
    @Autowired
    StudentExamInfoRes mapper;
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

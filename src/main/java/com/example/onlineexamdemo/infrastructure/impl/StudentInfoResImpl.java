package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.StudentInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.StudentInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentInfoResImpl implements StudentInfoRes {
    @Autowired
    StudentInfoMapper mapper;
    @Override
    public List<StudentInfo> getStudents(Map<String, Object> map) {
        return  mapper.getStudents(map);
    }

    @Override
    public StudentInfo getStudentById(int studentId) {
        return  mapper.getStudentById(studentId);
    }

    @Override
    public int isUpdateStudent(StudentInfo student) {
        return  mapper.isUpdateStudent(student);
    }

    @Override
    public int isDelStudent(int studentId) {
        return  mapper.isDelStudent(studentId);
    }

    @Override
    public int isAddStudent(StudentInfo student) {
        return  mapper.isAddStudent(student);
    }

    @Override
    public int getStudentTotal() {
        return  mapper.getStudentTotal();
    }

    @Override
    public StudentInfo getStudentByAccountAndPwd(String studentAccount) {
        return  mapper.getStudentByAccountAndPwd(studentAccount);
    }

    @Override
    public int isResetPwdWithStu(StudentInfo studentInfo) {
        return  mapper.isResetPwdWithStu(studentInfo);
    }

    @Override
    public List<StudentInfo> getStudentsByClassId(int classId) {
        return  mapper.getStudentsByClassId(classId);
    }
}

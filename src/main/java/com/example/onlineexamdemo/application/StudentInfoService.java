package com.example.onlineexamdemo.application;

import com.example.onlineexamdemo.infrastructure.po.StudentInfo;

import java.util.List;
import java.util.Map;

public interface StudentInfoService {
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

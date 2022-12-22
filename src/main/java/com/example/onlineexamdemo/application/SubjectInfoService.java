package com.example.onlineexamdemo.application;

import com.example.onlineexamdemo.infrastructure.po.SubjectInfo;

import java.util.List;
import java.util.Map;

public interface SubjectInfoService {
    public List<SubjectInfo> getSubjects(Map<String, Object> map);

    public SubjectInfo getSubjectWithId(int subjectId);

    public int getSubjectTotal();

    public int isAddSubject(SubjectInfo subject);

    public int isUpdateSubject(SubjectInfo subject);

    public int isDelSubject(int subjectId);

    //批量添加试题
    public int isAddSubjects(Map<String, Object> map);


}

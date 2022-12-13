package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.SubjectInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.SubjectInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.SubjectInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class SubjectInfoResImpl implements SubjectInfoRes {
    @Autowired
    SubjectInfoMapper mapper;
    @Override
    public List<SubjectInfo> getSubjects(Map<String, Object> map) {
        return mapper.getSubjects(map);
    }

    @Override
    public SubjectInfo getSubjectWithId(int subjectId) {
        return mapper.getSubjectWithId(subjectId);
    }

    @Override
    public int getSubjectTotal() {
        return mapper.getSubjectTotal();
    }

    @Override
    public int isAddSubject(SubjectInfo subject) {
        return mapper.isAddSubject(subject);
    }

    @Override
    public int isUpdateSubject(SubjectInfo subject) {
        return mapper.isUpdateSubject(subject);
    }

    @Override
    public int isDelSubject(int subjectId) {
        return mapper.isDelSubject(subjectId);
    }

    @Override
    public int isAddSubjects(Map<String, Object> map) {
        return mapper.isAddSubjects(map);
    }

}

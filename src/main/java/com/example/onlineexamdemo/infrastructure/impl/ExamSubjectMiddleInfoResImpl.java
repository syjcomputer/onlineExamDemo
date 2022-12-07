package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ExamSubjectMiddleInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamSubjectMiddleInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamSubjectMiddleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 18:36
 * @version: 1.0
 */
@Repository
public class ExamSubjectMiddleInfoResImpl implements ExamSubjectMiddleInfoRes {
    @Autowired
    ExamSubjectMiddleInfoMapper mapper;

    @Override
    public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm){
        return mapper.getExamPaperWithSubject(esm);
    }

    @Override
    public int isAddESM(Map<String, Object> map){
        return mapper.isAddESM(map);
    }

    @Override
    public int removeSubjectWithExamPaper(Map<String, Object> map){
        return mapper.removeSubjectWithExamPaper(map);
    }

    @Override
    public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm){
        return mapper.getEsmByExamIdWithSubjectId(esm);
    }

}

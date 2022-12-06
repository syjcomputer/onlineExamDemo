package com.example.onlineexamdemo.infrastructure.impl;

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
public class ExamSubjectMiddleInfoResImpl {
    @Autowired
    ExamSubjectMiddleInfoMapper mapper;

    public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm){
        return mapper.getExamPaperWithSubject(esm);
    }

    public int isAddESM(Map<String, Object> map){
        return mapper.isAddESM(map);
    }

    public int removeSubjectWithExamPaper(Map<String, Object> map){
        return mapper.removeSubjectWithExamPaper(map);
    }

    public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm){
        return mapper.getEsmByExamIdWithSubjectId(esm);
    }

}

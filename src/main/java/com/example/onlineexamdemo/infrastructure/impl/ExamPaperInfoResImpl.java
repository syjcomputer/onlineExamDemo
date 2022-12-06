package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ExamPaperInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamPaperInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamPaperInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 19:07
 * @version: 1.0
 */
@Repository
public class ExamPaperInfoResImpl implements ExamPaperInfoRes {

    @Autowired
    private ExamPaperInfoMapper mapper;

    @Override
    public List<ExamPaperInfo> getExamPapers(Map<String, Object> map){
        return mapper.getExamPapers(map);
    }

    @Override
    public ExamPaperInfo getExamPaperById(int examPaperId){
        return mapper.getExamPaperById(examPaperId);
    }

    @Override
    public List<ExamPaperInfo> getExamPapersClear(){
        return getExamPapersClear();
    }

    @Override
    public int isAddExamPaper(ExamPaperInfo examPaper){
        return mapper.isAddExamPaper(examPaper);
    }

    @Override
    public int isUpdateExamPaper(ExamPaperInfo examPaper){
        return mapper.isUpdateExamPaper(examPaper);
    }

    @Override
    public int isDelExamPaper(int examPaperId){
        return mapper.isDelExamPaper(examPaperId);
    }

    @Override
    public int getExamPpaerTotal(){
        return mapper.getExamPpaerTotal();
    }

    @Override
    public int isUpdateExamPaperSubjects(Map<String, Object> map){
        return mapper.isUpdateExamPaperSubjects(map);
    }

    @Override
    public int isUpdateExamPaperScore(Map<String, Object> map){
        return mapper.isUpdateExamPaperScore(map);
    }
}

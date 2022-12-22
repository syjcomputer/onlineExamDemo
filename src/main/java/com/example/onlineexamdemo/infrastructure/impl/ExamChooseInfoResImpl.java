package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ExamChooseInfoRes;
import com.example.onlineexamdemo.infrastructure.ExamHistoryPaperInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamChooseInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamChooseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 20:06
 * @version: 1.0
 */
@Repository
public class ExamChooseInfoResImpl implements ExamChooseInfoRes {

    @Autowired
    ExamChooseInfoMapper mapper;

    @Override
    public ExamChooseInfo getChooseWithIds(Map<String, Object> map){
        return mapper.getChooseWithIds(map);
    }

    @Override
    public int updateChooseWithIds(ExamChooseInfo examChoose){
        return mapper.updateChooseWithIds(examChoose);
    }

    @Override
    public int addChoose(Map<String, Object> map){
        return mapper.addChoose(map);
    }

    @Override
    public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map){
        return mapper.getChooseInfoWithSumScore(map);
    }

    @Override
    public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map){
        return mapper.getChooseInfoWithExamSubject(map);
    }
}

package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ExamHistoryPaperInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ExamHistoryPaperMapper;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 19:57
 * @version: 1.0
 */
@Repository
public class ExamHistoryPaperInfoResImpl implements ExamHistoryPaperInfoRes {

    @Autowired
    ExamHistoryPaperMapper mapper;

    @Override
    //查询考试历史信息，针对前台学生查询
    public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId){
        return mapper.getExamHistoryToStudent(studentId);
    }

    @Override
    public int isAddExamHistory(Map<String, Object> map){
        return mapper.isAddExamHistory(map);
    }

    @Override
    public int getHistoryInfoWithIds(Map<String, Object> map){
        return mapper.getHistoryInfoWithIds(map);
    }

    @Override
    //查询考试历史信息，针对后台教师查询
    public List<ExamHistoryInfo> getExamHistoryToTeacher(){
        return mapper.getExamHistoryToTeacher();
    }
}

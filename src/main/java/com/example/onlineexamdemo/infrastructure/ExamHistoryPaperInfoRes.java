package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryPaper;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName: ExamHistoryPaperInfoRes
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */
public interface ExamHistoryPaperInfoRes {

    //查询考试历史信息，针对前台学生查询
    public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId);

    public int isAddExamHistory(Map<String, Object> map);

    public int getHistoryInfoWithIds(Map<String, Object> map);

    //查询考试历史信息，针对后台教师查询
    public List<ExamHistoryInfo> getExamHistoryToTeacher();
}

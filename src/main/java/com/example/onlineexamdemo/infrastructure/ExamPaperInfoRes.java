package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ExamPaperInfo;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName: ExamPaperInfoRes
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */

public interface ExamPaperInfoRes {

    public List<ExamPaperInfo> getExamPapers(Map<String, Object> map);

    public ExamPaperInfo getExamPaperById(int examPaperId);

    public List<ExamPaperInfo> getExamPapersClear();

    public int isAddExamPaper(ExamPaperInfo examPaper);

    public int isUpdateExamPaper(ExamPaperInfo examPaper);

    public int isDelExamPaper(int examPaperId);

    public int getExamPpaerTotal();

    public int isUpdateExamPaperSubjects(Map<String, Object> map);

    public int isUpdateExamPaperScore(Map<String, Object> map);
}

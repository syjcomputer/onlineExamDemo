package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ExamSubjectMiddleInfo;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName: ExamSubjectMiddleInfoRes
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */
public interface ExamSubjectMiddleInfoRes {
    public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(ExamSubjectMiddleInfo esm);

    public int isAddESM(Map<String, Object> map);

    public int removeSubjectWithExamPaper(Map<String, Object> map);

    public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm);
}

package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ExamChooseInfo;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName: ExamChooseInfoRes
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */
public interface ExamChooseInfoRes {
    public ExamChooseInfo getChooseWithIds(Map<String, Object> map);

    public int updateChooseWithIds(ExamChooseInfo examChoose);

    public int addChoose(Map<String, Object> map);

    public List<ExamChooseInfo> getChooseInfoWithSumScore(Map<String, Object> map);

    public List<ExamChooseInfo> getChooseInfoWithExamSubject(Map<String, Object> map);
}

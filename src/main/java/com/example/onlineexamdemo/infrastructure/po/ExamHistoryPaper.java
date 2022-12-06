package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamHistoryPaper</p>
  * <p>Description: 扩展类，用于封装历史考试信息、试卷信息、考试时间</p>
  * @version: 1.0
  */

@Component
@Data
public class ExamHistoryPaper {

	@TableField
	// 试卷得分
	private int examScore;

	@TableField
	// 考试时间
	private String beginTime;

	@TableField
	private Integer examPaperId;

	@TableField
	private String examPaperName;

	@TableField
	private int subjectNum;

	@TableField
	private int examPaperScore;

}

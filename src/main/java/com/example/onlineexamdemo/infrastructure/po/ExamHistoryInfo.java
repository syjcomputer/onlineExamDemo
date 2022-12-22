package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamHistoryInfo</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Component
@Data
public class ExamHistoryInfo {

	@TableField
	private Integer historyId;

	@TableField
	private StudentInfo student;

	@TableField
	private ExamPaperInfo examPaper;

	@TableField
	private int examScore;

}

package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamChooseInfo</p>
  * <p>Description: 考生考试选择答案信息</p>
  * @version: 1.0
  */

@Component
@Data
public class ExamChooseInfo {

	@TableField
	private Integer chooseId;

	@TableField
	private StudentInfo student;

	@TableField
	private ExamPaperInfo examPaper;

	@TableField
	private SubjectInfo subject;

	@TableField
	private String chooseResult;

}

package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamPaperInfo</p>
  * <p>Description: 试卷实体</p>
  * @version: 1.0
  */

@Data
@Component
public class ExamPaperInfo {

	@TableField
	private Integer examPaperId;

	@TableField
	private String examPaperName;

	@TableField
	private int subjectNum;

	@TableField
	private int examPaperTime;

	@TableField
	private int examPaperScore;

	@TableField
	private int division;

	@TableField
	private int examPaperEasy;

	//@TableField
	private GradeInfo grade;

}

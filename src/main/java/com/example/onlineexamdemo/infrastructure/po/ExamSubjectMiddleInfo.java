package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamSubjectMiddleInfo</p>
  * <p>Description: 试卷、试题中间关联表</p>
  * @version: 1.0
  */

@Data
@Component
public class ExamSubjectMiddleInfo {

	@TableField
	private Integer esmId;

	@TableField
	private ExamPaperInfo examPaper;

	@TableField
	private SubjectInfo subject;

}

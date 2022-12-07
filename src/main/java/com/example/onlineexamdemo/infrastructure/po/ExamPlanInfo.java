package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ExamPlanInfo</p>
  * <p>Description: 考试安排记录</p>
  * @version: 1.0
  */

@Component
@Data
public class ExamPlanInfo {

	@TableField
	private Integer examPlanId;

	@TableField
	private CourseInfo course;

	@TableField
	private ClassInfo clazz;

	@TableField
	private ExamPaperInfo examPaper;

	@TableField
	private String beginTime;
}

package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
  *
  * <p>Title: SubjectInfo</p>
  * <p>Description: 试题实体类</p>
  * @version: 1.0
  */

@Component
@Data
@SuppressWarnings("serial")
public class SubjectInfo implements Serializable {
	@TableField
	private Integer subjectId;
	@TableField
	private String subjectName;
	@TableField
	private String optionA;
	@TableField
	private String optionB;
	@TableField
	private String optionC;
	@TableField
	private String optionD;
	@TableField
	private String rightResult;
	@TableField
	private int subjectScore;
	@TableField
	private int subjectType;
	@TableField
	private int subjectEasy;
	@TableField
	private int division;
	@TableField
	private CourseInfo course;
	@TableField
	private GradeInfo grade;



}

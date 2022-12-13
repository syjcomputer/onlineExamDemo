package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: CourseInfo</p>
  * <p>Description: 学科实体类</p>
  * @version: 1.0
  */

@Component
@Data
public class CourseInfo {
	@TableField
	private Integer courseId;

	@TableField
	private String courseName;

	@TableField
	private Integer division;

	@TableField
	private GradeInfo grade;


	public CourseInfo(Integer courseId) {

	}
}

package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: ClassInfo</p>
  * <p>Description: 班级实体类</p>
  * @version: 1.0
  */

@Component
@Data
public class ClassInfo {
	@TableField
	private Integer classId;

	@TableField
	private String className;

	@TableField
	private GradeInfo grade;

	@TableField
	private TeacherInfo teacher;


}

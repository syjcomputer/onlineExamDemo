package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: TeacherInfo</p>
  * <p>Description: 教师实体类</p>
  * @version: 1.0
  */

@Component
@Data
public class TeacherInfo {
	@TableField
	private Integer teacherId;
	@TableField
	private String teacherName;
	@TableField
	private String teacherAccount;
	@TableField
	private String teacherPwd;
	@TableField
	private int adminPower;
	@TableField
	private Integer isWork;
	@TableField
	private ClassInfo classInfo;


}

package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: StudentInfo</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Component
@Data
public class StudentInfo {
	@TableField
	private Integer studentId;
	@TableField
	private String studentName;
	@TableField
	private String studentAccount;
	@TableField
	private String studentPwd;
	@TableField
	private ClassInfo classInfo;
	@TableField
	private GradeInfo grade;

}

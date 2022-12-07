package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: StudentExamInfo</p>
  * <p>Description: 学生考试信息  主要用于前台图表绘制 数据封装</p>
  * @version: 1.0
  */

@Component
@Data
public class StudentExamInfo {
	@TableField
	private Integer studentId;
	@TableField
	private String studentName;
	@TableField
	private Integer examSum;
	@TableField
	private Integer avgScore;


	@TableField
	private Integer examScore;
	@TableField
	private String examPaperName;
	@TableField
	private Integer examPaperScore;




}

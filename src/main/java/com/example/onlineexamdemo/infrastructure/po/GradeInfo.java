package com.example.onlineexamdemo.infrastructure.po;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
  *
  * <p>Title: GradeInfo</p>
  * <p>Description: 年级实体类</p>
  * @version: 1.0
  */

@Data
public class GradeInfo {

	@TableField
	private Integer gradeId;

	@TableField
	private String gradeName;

//	public Integer getGradeId() {
//		return gradeId;
//	}
//
//	public void setGradeId(Integer gradeId) {
//		this.gradeId = gradeId;
//	}
//
//	public String getGradeName() {
//		return gradeName;
//	}
//
//	public void setGradeName(String gradeName) {
//		this.gradeName = gradeName;
//	}
//
//	public GradeInfo(Integer gradeId) {
//		super();
//		this.gradeId = gradeId;
//	}
//
//	public GradeInfo() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		return "GradeInfo [gradeId=" + gradeId + ", gradeName=" + gradeName
//				+ "]";
//	}

}

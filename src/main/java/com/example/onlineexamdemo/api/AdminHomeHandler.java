package com.example.onlineexamdemo.api;

import com.example.onlineexamdemo.application.ExamPaperInfoService;
import com.example.onlineexamdemo.application.StudentInfoService;
import com.example.onlineexamdemo.application.SubjectInfoService;
import com.example.onlineexamdemo.application.TeacherInfoService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
  *
  * <p>Title: AdminHomeHandler</p>
  * <p>Description: 后台首页相关</p>
  * @version: 1.0
  */

@Controller
//@RequestMapping
public class AdminHomeHandler {

	@Autowired
	ExamPaperInfoService examPaperInfoService;
	@Autowired
	SubjectInfoService subjectInfoService;
	@Autowired
	TeacherInfoService teacherInfoService;
	@Autowired
	StudentInfoService studentInfoService;
	@Autowired
	Gson gson;
	
	//private Logger logger = Logger.getLogger(AdminHomeHandler.class);
	
	
	@RequestMapping("homeInfo")
	//@ResponseBody
	public void homeInfo(HttpServletResponse response) throws IOException {
		//logger.info("加载后台首页相关数据");

		int examPaperTotal = examPaperInfoService.getExamPpaerTotal();
		int subjectTotal = subjectInfoService.getSubjectTotal();
		int teacherTotal = teacherInfoService.getTeacherTotal();
		int studentTotal = studentInfoService.getStudentTotal();

//		int examPaperTotal = 3;
//		int subjectTotal = 2;
//		int teacherTotal = 1;
//		int studentTotal = 3;
		
		String json = "{\"examPaperTotal\":"+examPaperTotal+", " +
				"\"subjectTotal\":"+subjectTotal+", " +
				"\"teacherTotal\":"+teacherTotal+", " +
				"\"studentTotal\":"+studentTotal+"}";
		
		response.getWriter().print(json);


	}
}

package com.example.onlineexamdemo.api;

import com.example.onlineexamdemo.application.ExamHistoryPaperService;
import com.example.onlineexamdemo.infrastructure.po.ExamHistoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
  *
  * <p>Title: ExamHistoryInfoHandler</p>
  * <p>Description: </p>
  * @version: 1.0
  */

@Controller
public class ExamHistoryInfoHandler {

	@Autowired
	private ExamHistoryPaperService examHistoryPaperService;
	
	//private Logger logger = Logger.getLogger(ExamHistoryInfoHandler.class);
	
	
	@RequestMapping("/historys")
	public ModelAndView examHistorys() {
		List<ExamHistoryInfo> historys = examHistoryPaperService.getExamHistoryToTeacher();
		ModelAndView model = new ModelAndView("admin/examHistorys");
		//logger.info("教师 查询历史考试信息 SIZE "+historys.size());
		
		model.addObject("historys", historys);
		
		return model;
	}
}

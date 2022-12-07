package com.example.onlineexamdemo;

import com.example.onlineexamdemo.application.ExamPaperInfoService;
import com.example.onlineexamdemo.application.GradeInfoService;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class OnlineExamDemoApplicationTests {

    @Autowired
    GradeInfoService gradeInfoService;

    @Autowired
    GradeInfo gradeInfo;

    @Autowired
    ExamPaperInfoService paperInfoService;

    @Test
    @Transactional
    @Rollback(value = false)
    public void test2(){
//        Map<String, Object> t = new HashMap<String,Object>();
//        t.put("score",2);
//        t.put("examPaperId",1);
//        System.out.println(paperInfoService.isUpdateExamPaperScore(t));

        System.out.println(gradeInfoService.getGradeById(1));
    }


    @Test
    void contextLoads() {
    }

}

package com.example.onlineexamdemo;

import com.example.onlineexamdemo.application.GradeInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class OnlineExamDemoApplicationTests {

    @Autowired
    GradeInfoService gradeInfoService;

    @Test
    @Transactional
    @Rollback(value = false)
    public void test2(){
        System.out.println(gradeInfoService.getGradeById(1));
    }


    @Test
    void contextLoads() {
    }

}

package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.mapper.GradeInfoMapper;
import com.example.onlineexamdemo.infrastructure.GradeInfoRes;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: sunyujie
 * @time: 2022/12/6 16:23
 * @version: 1.0
 */
@Repository
public class GradeInfoResImpl implements GradeInfoRes {
    @Autowired
    GradeInfoMapper mapper;

    //获取所有年级

    public List<GradeInfo> getGrades(){
        return mapper.getGrades();
    }

    //根据编号获取年级
    public GradeInfo getGradeById(int gradeId){
        return mapper.getGradeById(gradeId);
    }

    //添加年级
    public int isAddGrade(GradeInfo grade){
        return mapper.isAddGrade(grade);
    }

    //删除年级
    public int isDelGrade(int gradeId){
        return mapper.isDelGrade(gradeId);
    }

    //修改年级
    public int isUpdateGrade(GradeInfo grade){
        return mapper.isUpdateGrade(grade);
    }

}

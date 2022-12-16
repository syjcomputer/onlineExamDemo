package com.example.onlineexamdemo.infrastructure.impl;

import com.example.onlineexamdemo.infrastructure.ClassInfoRes;
import com.example.onlineexamdemo.infrastructure.mapper.ClassInfoMapper;
import com.example.onlineexamdemo.infrastructure.po.ClassInfo;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import com.example.onlineexamdemo.infrastructure.po.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class ClassInfoResImpl implements ClassInfoRes {
    @Autowired
    ClassInfoMapper mapper;

    //获取班级集合
    @Override
    public List<ClassInfo> getClasses(ClassInfo classInfo) {
        return mapper.getClasses(classInfo);
    }

    //添加班级
    @Override
    public int isAddClass(ClassInfo classInfo) {
        return mapper.isAddClass(classInfo);
    }

    //删除班级
    @Override
    public int isDelClass(int classId) {
        return mapper.isDelClass(classId);
    }
    @Override
    public ClassInfo getClassById(int classId) {
        return mapper.getClassById(classId);
    }
    @Override
    public int isUpdateClass(ClassInfo classInfo) {
        return mapper.isUpdateClass(classInfo);
    }

    //获取指定年级下的班级
    @Override
    public List<ClassInfo> getClassByGradeId(int gradeId) {
        return mapper.getClassByGradeId(gradeId);
    }

    //获取各(指定年级下)班级下的学生总量
    @Override
    public Map<String, Object> getStudentCountForClass(Integer gradeId) {
        return mapper.getStudentCountForClass(gradeId);
    }

    //根据当前班级班主任编号获取当前班级信息
    @Override
    public ClassInfo getClassByTeacherId(int teacherId) {
        return mapper.getClassByTeacherId(teacherId);
    }
}

package com.example.onlineexamdemo.infrastructure;

import com.example.onlineexamdemo.infrastructure.po.ClassInfo;
import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import com.example.onlineexamdemo.infrastructure.po.TeacherInfo;

import java.util.List;
import java.util.Map;

public interface ClassInfoRes {
    // 获取班级集合
    public List<ClassInfo> getClasses(ClassInfo classInfo);

    // 添加班级
    public int isAddClass(ClassInfo classInfo);

    // 删除班级
    public int isDelClass(int classId);

    // 根据编号获取班级信息
    public ClassInfo getClassById(int classId);

    //根据当前班级班主任编号获取当前班级信息
    public ClassInfo getClassByTeacherId(int teacherId);

    // 修改班级信息
    public int isUpdateClass(ClassInfo classInfo);

    //获取指定年级下的班级集合
    public List<ClassInfo> getClassByGradeId(int gradeId);

    public Map<String, Object> getStudentCountForClass(Integer gradeId);
}

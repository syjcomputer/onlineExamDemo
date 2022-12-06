package com.example.onlineexamdemo.infrastructure.mapper;

import com.example.onlineexamdemo.infrastructure.po.GradeInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName: GradeXmlMapper
 * @Description:
 * @Author: syj
 * @Date: 2022/12/6
 * @Version: 1.0
 */
@Mapper
public interface GradeInfoMapper {
    //获取所有年级
    public List<GradeInfo> getGrades();

    //根据编号获取年级
    public GradeInfo getGradeById(@Param("gradeId") int gradeId);

    //添加年级
    public int isAddGrade(GradeInfo grade);

    //删除年级
    public int isDelGrade(@Param("gradeId") int gradeId);

    //修改年级
    public int isUpdateGrade(GradeInfo grade);
}

package com.yizhi.student.dao;

import com.yizhi.student.domain.StudentInfoDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 生基础信息表
 *
 * @author dunhf
 * @email 499345515@qq.com
 * @date 2019-08-01 09:45:46
 */
@Mapper
public interface StudentInfoDao {


    @Select("select * from s_student_info where id=#{id}")
    StudentInfoDO get(Integer id);


    // 20个前端传来对的字段，2个为null，4个controller生成，一共26个字段
    int save(StudentInfoDO studentInfo);


    int update(StudentInfoDO studentInfo);


    List<StudentInfoDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    @Delete("delete from s_student_info where id=#{id}")
    int remove(Integer id);

    int batchRemove(Integer[] ids);


}
package com.yizhi.student.service;

import com.yizhi.student.domain.StudentInfoDO;

import java.util.List;
import java.util.Map;

/**
 * 生基础信息表
 *
 * @author dunhf
 * @email 499345515@qq.com
 * @date 2019-08-01 09:45:46
 */
public interface StudentInfoService {

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    StudentInfoDO get(Integer id);

    /**
     * 分页 条件 查询
     *
     * @param map
     * @return
     */
    List<StudentInfoDO> list(Map<String, Object> map);

    /**
     * 分页 条件 查询从记录数
     *
     * @param map
     * @return
     */
    int count(Map<String, Object> map);

    /**
     * 新增一条记录
     *
     * @param studentInfo
     * @return
     */
    int save(StudentInfoDO studentInfo);

    /**
     * 更新一条记录
     *
     * @param studentInfo
     * @return
     */
    int update(StudentInfoDO studentInfo);

    /**
     * 删除一条记录
     *
     * @param id
     * @return
     */
    int remove(Integer id);

    /**
     * 根据id批量删除
     *
     * @param ids
     * @return
     */
    int batchRemove(Integer[] ids);
}

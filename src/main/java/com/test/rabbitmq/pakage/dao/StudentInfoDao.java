package com.test.rabbitmq.pakage.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.test.rabbitmq.pakage.bean.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学生客户基本信息表-未分配 Mapper 接口
 * </p>
 *
 * @author crm
 * @since 2019-06-06
 */
public interface StudentInfoDao extends BaseMapper<StudentInfo> {

}

package com.test.rabbitmq.pakage.serviceImpl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.test.rabbitmq.pakage.bean.StudentInfo;
import com.test.rabbitmq.pakage.dao.StudentInfoDao;
import com.test.rabbitmq.pakage.servcie.StudentInfoMgr;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生客户基本信息表-未分配 服务实现类
 * </p>
 *
 * @author crm
 * @since 2019-06-06
 */
@Service
public class StudentInfoMgrImpl extends ServiceImpl<StudentInfoDao, StudentInfo> implements StudentInfoMgr {

}

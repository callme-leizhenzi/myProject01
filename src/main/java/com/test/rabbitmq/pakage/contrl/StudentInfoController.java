package com.test.rabbitmq.pakage.contrl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.test.rabbitmq.pakage.bean.BussinessException;
import com.test.rabbitmq.pakage.bean.StudentInfo;
import com.test.rabbitmq.pakage.servcie.StudentInfoMgr;
import com.test.rabbitmq.pakage.utils.Cache;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 学生客户基本信息表-未分配 前端控制器
 * </p>
 *
 * @author crm
 * @since 2019-06-06
 */
@Api(description="学生客户资料信息接口")
@RestController
@RequestMapping("/studentInfo")
public class StudentInfoController {
    @Autowired
    private StudentInfoMgr studentInfoMgr;

    @Autowired
    Cache cache;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation("学生测试接口")
    @RequestMapping("/getStudentInfo")
    public StudentInfo getStudentInfo(@Valid StudentInfo studentInfo) throws BussinessException{
        String phone = studentInfo.getPhone();
       if(phone.equals("1"))
        throw new BussinessException(-1,"学生信息错误");

        logger.info("入参为"+phone);

        StudentInfo studentInfo1 = cache.getCache(phone, StudentInfo.class);
        if(studentInfo1!=null){
            return studentInfo1;
        }
        StudentInfo studentInfos = studentInfoMgr.selectList(new EntityWrapper<StudentInfo>().eq("phone", "18672859451")).get(0);
        cache.addCache(phone,studentInfo);
        return studentInfo;
    }
}


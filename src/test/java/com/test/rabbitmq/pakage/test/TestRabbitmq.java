package com.test.rabbitmq.pakage.test;

import com.test.rabbitmq.pakage.bean.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xulei on 2019/6/3.
 */
@SpringBootTest(classes=TestRabbitmq.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRabbitmq {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void testRabbit() {
        helloSender.send();
    }
}

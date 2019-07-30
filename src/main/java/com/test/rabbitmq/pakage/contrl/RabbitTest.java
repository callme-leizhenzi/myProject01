package com.test.rabbitmq.pakage.contrl;

import com.test.rabbitmq.pakage.bean.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xulei on 2019/6/3.
 */

@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

    @Autowired
    private HelloSender helloSender;

    @PostMapping("/hello")
    public void hello() {
        for(int i = 0;i<100;i++){
            helloSender.send();
        }
    }
}

package com.test.rabbitmq.pakage.bean;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by xulei on 2019/6/3.
 */
@Component
public class HelloReceive {
    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("Receive1:"+str);
    }

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processD(String str) {
        System.out.println("Receive2:"+str);
    }
}

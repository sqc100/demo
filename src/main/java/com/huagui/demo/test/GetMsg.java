package com.huagui.demo.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//@Component
//@/RabbitListener(queues = "hello")
public class GetMsg {

    //@RabbitHandler
    public void getMsg(String msg){
        System.out.println("Receiver:"+msg);
    }
}

package com.huagui.demo.test;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//@Configuration
public class Beanzr {
   // @Bean
    public Queue helloQueue(){ return new Queue("hello");
    }
}

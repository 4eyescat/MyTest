//package com.example.demo.com.mq;
//
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Component;
//
///**
// * @Description:
// * @Author: yun qi
// * @Date: 2018/4/6 下午7:51
// */
//@Component
//public class Consumer {
//    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
//    @JmsListener(destination = "mytest.queue")
//    @SendTo("out.queue")
//    public String receiveQueue(String text) {
//        System.out.println("Consumer收到的报文为:"+text);
//        return "返回队列";
//    }
//}

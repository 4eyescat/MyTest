/*
package com.example.demo.com.mq;

import org.apache.activemq.broker.region.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Destination;

*/
/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/6 下午7:31
 *//*

@Service
public class Producer {
    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;

    public void sendMessage(Destination destination, final String message){
        jmsTemplate.convertAndSend(destination, message);
    }

    @JmsListener(destination="out.queue")
    public void consumerMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }
}
*/

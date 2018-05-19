//package com.example.demo.com.job;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * @Description:
// * @Author: yun qi
// * @Date: 2018/4/6 下午8:49
// */
//@Component
//public class ScheduledTasks {
//
//    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//
//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTime() {
//        System.out.println("现在时间：" + dateFormat.format(new Date()));
//    }
//
//}

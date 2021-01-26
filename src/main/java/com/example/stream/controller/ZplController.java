package com.example.stream.controller;

import com.example.stream.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZplController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("send")
    public String send(Person person) {
        //第一种方式：指定消息topic发送
        streamBridge.send("logTopic2", person);
        return "success";
    }

    @GetMapping("/sendMy")
    public String sendMy(Person person){
        //第二种方式：指定消息bindingName发送
        streamBridge.send("process-in-0", person);
        return "success";
    }
}

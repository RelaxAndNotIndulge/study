package com.example.stream.config;

import com.example.stream.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
public class StreamConfig {

    /**
     * 消费者： topic在配置文件中指定
     *        bindingName: 默认：process-in-0
     * @return
     */
    @Bean
    public Consumer<Person> process() {
        return person -> log.info("consumer222:{}", person);
    }


    /**
     * 持续生产消息，默认每秒循环一次
     * @param args
     */
//    @Bean
//    public Supplier<Person> supplier() {
//        return () -> {
//            Person person = new Person();
//            person.setAge(1);
//            person.setName("abcd");
//            System.out.println("========");
//            return person;
//        };
//    }

}

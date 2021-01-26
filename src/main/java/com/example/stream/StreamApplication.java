package com.example.stream;

import com.example.stream.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Slf4j
@SpringBootApplication
public class StreamApplication {





    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
    }

}

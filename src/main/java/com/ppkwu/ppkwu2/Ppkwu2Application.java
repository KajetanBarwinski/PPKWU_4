package com.ppkwu.ppkwu2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ppkwu2Application {

    public static void main(String[] args) {
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "{}");
        SpringApplication.run(Ppkwu2Application.class, args);
    }

}

package com.sharding.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * 这个项目因为pom依赖问题，还没有启动，依赖参照本地代码仓库的sharding-jdbc-example项目
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

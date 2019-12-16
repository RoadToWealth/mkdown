package com.hzc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: HuangZhicheng
 * @Date: 2019/12/12 20:56
 * @Description: 标注一个主程序类，用来标明这是一个Spring Boot应用
 */
@SpringBootApplication
public class SpringBootApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class,args);
    }
}

package com.huang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: blog
 * @Package: com.huang
 * @ClassName: huangBlogApplication
 * @Description:
 * @Author: arrival
 * @Version: TODO
 * @Create: 2022/02/26 12:38
 */
@SpringBootApplication
@MapperScan("com.huang.mapper")
public class huangBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(huangBlogApplication.class);
    }
}

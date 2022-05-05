package com.xjz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class GeoApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeoApplication.class,args);
    }
}

package com.crp;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ms-eureka - com.crp
 *
 * @author superChen
 * @create 2017-03-30 11:04
 */
@SpringBootApplication
@EnableEurekaServer
@Log4j
public class EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
        log.info("ms-eureka start success！");
    }
}

package com.gsrk.redis.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * SpringBootRedisMongoDB
 *
 */
@SpringBootApplication
@EnableCaching
public class SpringBootRedisMongoDB 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootRedisMongoDB.class, args);
    }
}

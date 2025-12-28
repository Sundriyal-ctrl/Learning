//package com.example.Learning.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//
//import java.time.Duration;
//
//@Configuration
//public class RedisConfig {
//
//    @Bean
//    public RedisCacheConfiguration cacheConfiguration() {
//        return RedisCacheConfiguration.defaultCacheConfig()
//                .entryTtl(Duration.ofHours(1))
//                .disableCachingNullValues();
//    }
//}
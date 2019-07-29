package com.test.rabbitmq.pakage.config;


import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by xulei on 2019/6/6.
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.test.rabbitmq.pakage.dao")
public class MyBatisConfig {
//    /**
//     * SQL执行效率插件
//     */
//    @Bean
//    @Profile("dev")
//    public PerformanceInterceptor performanceInterceptor() {
//        return new PerformanceInterceptor();
//    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

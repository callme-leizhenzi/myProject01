package com.test.rabbitmq.pakage.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;

/**
 * Created by xulei on 2019/6/6.
 */
@Configuration
public class ValidateConfig {
    @Bean
    public Validator validate() {
        return  Validation.byProvider(HibernateValidator.class)
                .configure()
                .failFast(true)
                .buildValidatorFactory()
                .getValidator();
    }
}

package com.example.trainingproject.service;

import com.example.trainingproject.condtion.MyCondition;
import com.example.trainingproject.domain.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


/**
 * Created by IntelliJ IDEA.
 * User: jam
 * Date: 2018/6/28
 * Time: 下午9:17
 */
@Configuration
@Conditional({MyCondition.class})
public class TestService {

    @Bean
    public Apple getDriver(){
        return new Apple();
    }
}

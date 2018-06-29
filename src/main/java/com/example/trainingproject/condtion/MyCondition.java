package com.example.trainingproject.condtion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by IntelliJ IDEA.
 * User: jam
 * Date: 2018/6/28
 * Time: 下午9:18
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(" condition is false");
        return true;
    }
}

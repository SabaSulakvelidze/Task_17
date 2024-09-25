package com.example.Task_17.config;

import com.example.Task_17.outsourcedServices.FirstEvaluationService;
import com.example.Task_17.outsourcedServices.IEvaluationService;
import com.example.Task_17.outsourcedServices.SecondEvaluationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BookShopConfig {

        @Bean
        @Qualifier("firstEvaluationService")
        public IEvaluationService getFirstEvaluationService(){
            return new FirstEvaluationService();
        }

        @Bean
        @Qualifier("secondEvaluationService")
        public IEvaluationService getSecondEvaluationService(){
            return new SecondEvaluationService();
        }
}

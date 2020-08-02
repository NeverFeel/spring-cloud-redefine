package com.ilidan.ribbonconsumer.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AvoidScan
public class RibbonRuleConfiguration {

    @Autowired
    private IClientConfig iClientConfig;

//    @Bean
//    public IRule ribbonRule(){
//        return new RandomRule();
//    }

    @Bean
    public IRule ribbonRule(IClientConfig iClientConfig){
        return new RandomRule();
    }

}

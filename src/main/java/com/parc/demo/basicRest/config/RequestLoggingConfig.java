package com.parc.demo.basicRest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingConfig {

    private static final int CONTENT_CACHE_LIMIT = 500;

    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter(){
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(CONTENT_CACHE_LIMIT);
        loggingFilter.setIncludeHeaders(true);
        return loggingFilter;
    }

}
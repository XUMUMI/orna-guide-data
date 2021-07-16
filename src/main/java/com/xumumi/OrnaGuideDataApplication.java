package com.xumumi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 主程序入口
 *
 * @author xumumi
 */
@SpringBootApplication
public class OrnaGuideDataApplication {

    public static void main(final String[] args) {
        SpringApplication.run(OrnaGuideDataApplication.class, args);
    }

    @SuppressWarnings("DesignForExtension")
    @Bean
    public RestTemplate restTemplate(final RestTemplateBuilder builder) {
        return builder.build();
    }

}

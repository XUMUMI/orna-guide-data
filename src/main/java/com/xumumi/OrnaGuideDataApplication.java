package com.xumumi;

import com.xumumi.api.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * 主程序入口
 *
 * @author xumumi
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties(Config.class)
public class OrnaGuideDataApplication {
    @SuppressWarnings("StaticNonFinalField")
    public static ConfigurableApplicationContext context;

    public static void main(final String[] args) {
        context = SpringApplication.run(OrnaGuideDataApplication.class, args);
    }

    @SuppressWarnings("DesignForExtension")
    @Bean
    public RestTemplate restTemplate(final RestTemplateBuilder builder) {
        return builder.build();
    }
}

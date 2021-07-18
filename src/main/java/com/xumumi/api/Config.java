package com.xumumi.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取配置文件
 *
 * @author xumumi
 */
@ConfigurationProperties("orna")
public class Config {
    private String url;

    public final String getUrl() {
        return url;
    }

    public final void setUrl(final String value) {
        url = value;
    }
}

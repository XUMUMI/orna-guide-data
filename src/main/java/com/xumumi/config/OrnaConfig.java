package com.xumumi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 读取配置文件
 *
 * @author xumumi
 */
@ConfigurationProperties("orna")
public class OrnaConfig {
    private String url;
    private String imgUrl;

    public final String getUrl() {
        return url;
    }

    public final void setUrl(final String value) {
        url = value;
    }

    public final String getImgUrl() {
        return imgUrl;
    }

    public final void setImgUrl(final String value) {
        imgUrl = value;
    }
}

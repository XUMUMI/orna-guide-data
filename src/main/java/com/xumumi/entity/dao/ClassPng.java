package com.xumumi.entity.dao;

import com.xumumi.OrnaGuideDataApplication;
import com.xumumi.config.OrnaConfig;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 职业图片类
 *
 * @author xumumi
 */
@Entity
@Table(name = "classPng")
public final class ClassPng {
    @Id
    private Integer id;
    private Integer classId;
    private String url;
    @Transient
    private final OrnaConfig ornaConfig = OrnaGuideDataApplication.context.getBean(OrnaConfig.class);

    public Integer getId() {
        return id;
    }

    public void setId(final Integer value) {
        id = value;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(final Integer value) {
        classId = value;
    }

    public String getUrl() {
        return "%s/%s".formatted(ornaConfig.getImgUrl(), url);
    }

    public void setUrl(final String value) {
        url = value;
    }
}

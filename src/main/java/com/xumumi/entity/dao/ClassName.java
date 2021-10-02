package com.xumumi.entity.dao;

import com.xumumi.OrnaGuideDataApplication;
import com.xumumi.service.ClassService;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Objects;

/**
 * 职业表仅存职业名对象
 *
 * @author xumumi
 */
@Entity
@Table(name = "class")
public final class ClassName extends ClassBase {
    @Transient
    private final ClassService classService = OrnaGuideDataApplication.context.getBean(ClassService.class);

    /**
     * 获取职业图片
     *
     * @return 图片地址
     */
    public String getImage() {
        final ClassPng classPng = classService.getImage(getId());
        return Objects.nonNull(classPng) ? classPng.getUrl() : "";
    }
}

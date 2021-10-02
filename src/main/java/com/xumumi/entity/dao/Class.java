package com.xumumi.entity.dao;

import com.xumumi.OrnaGuideDataApplication;
import com.xumumi.service.ClassService;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Arrays;

/**
 * 职业表对象
 *
 * @author xumumi
 */
@Entity
@Table(name = "class")
public final class Class extends ClassBase {
    private Integer tier;
    private String description;
    private String descriptionCn;
    private Double price;
    private Boolean special;
    private Integer slots;
    private String learns;

    public Integer getTier() {
        return tier;
    }

    public void setTier(final Integer value) {
        tier = value;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double value) {
        price = value;
    }

    public Boolean isSpecial() {
        return special;
    }

    public void setSpecial(final Boolean value) {
        special = value;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(final Integer value) {
        slots = value;
    }

    public String getLearns() {
        return learns;
    }

    public void setLearns(final String value) {
        learns = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String value) {
        description = value;
    }

    public String getDescriptionCn() {
        return descriptionCn;
    }

    public void setDescriptionCn(final String value) {
        descriptionCn = value;
    }

    @Transient
    private final ClassService classService = OrnaGuideDataApplication.context.getBean(ClassService.class);

    public String[] getImages() {
        return Arrays.stream(classService.getImages(getId())).map(ClassPng::getUrl).toArray(String[]::new);
    }
}

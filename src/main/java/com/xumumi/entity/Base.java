package com.xumumi.entity;

import com.xumumi.util.LanguageUtil;

import javax.persistence.*;

/**
 * 基础类型
 *
 * @author xumumi
 */
@MappedSuperclass
public class Base {
    @Id
    private Integer id;
    private String name;
    private String nameCn;
    private String description;
    private String descriptionCn;
    private Integer tier;
//    private String image;

    public final Integer getId() {
        return id;
    }

    public final void setId(final Integer value) {
        id = value;
    }

    public final String getName() {
        return LanguageUtil.getCurrentLang().equals(LanguageUtil.EN_US) ? name : nameCn;
    }

    public final void setName(final String value) {
        name = value;
    }

    public final void setNameCn(final String value) {
        nameCn = value;
    }

    public final String getDescription() {
        return LanguageUtil.getCurrentLang().equals(LanguageUtil.EN_US) ? description : descriptionCn;
    }

    public final void setDescription(final String value) {
        description = value;
    }

    public final void setDescriptionCn(final String value) {
        descriptionCn = value;
    }

    public final Integer getTier() {
        return tier;
    }

    public final void setTier(final Integer value) {
        tier = value;
    }

//    public final String getImage() {
//        return image;
//    }
//
//    public final void setImage(final String value) {
//        image = value;
//    }
}

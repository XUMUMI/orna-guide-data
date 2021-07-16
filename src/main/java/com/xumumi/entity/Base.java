package com.xumumi.entity;

/**
 * 基础类型
 *
 * @author xumumi
 */
public class Base {
    private Integer id;
    private String name;
    private String description;
    private Integer tier;
    private String image;

    public final Integer getId() {
        return id;
    }

    public final void setId(final Integer value) {
        id = value;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String value) {
        name = value;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String value) {
        description = value;
    }

    public final Integer getTier() {
        return tier;
    }

    public final void setTier(final Integer value) {
        tier = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

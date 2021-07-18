package com.xumumi.entity;

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
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer tier;
    @Column
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

    public final String getImage() {
        return image;
    }

    public final void setImage(final String value) {
        image = value;
    }
}

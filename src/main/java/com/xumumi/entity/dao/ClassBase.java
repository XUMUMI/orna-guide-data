package com.xumumi.entity.dao;

import com.xumumi.util.LanguageUtil;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 职业基础类
 *
 * @author xumumi
 */
@MappedSuperclass
public class ClassBase {
    @Id
    private Integer id;
    private String name;
    private String nameCn;
    private String femaleName;
    private String femaleNameCn;

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

    public final String getFemaleName() {
        return LanguageUtil.getCurrentLang().equals(LanguageUtil.EN_US) ? femaleName : femaleNameCn;
    }

    public final void setFemaleName(final String value) {
        femaleName = value;
    }

    public final void setFemaleNameCn(final String value) {
        femaleNameCn = value;
    }
}

package com.xumumi.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 职业类型
 *
 * @author xumumi
 */
public class Class extends Base {
    private String femaleName;
    private String cost;
    private Integer costType;
    private String costTypeStr;
    private List<String> images;
    private SkillsInfo skills;
    private List<String> learns;
    private List<String> stats;

    public final String getFemaleName() {
        return femaleName;
    }

    public final void setFemaleName(final String value) {
        femaleName = value;
    }

    public final String getCost() {
        return cost;
    }

    public final void setCost(final String value) {
        cost = value;
    }

    public final Integer getCostType() {
        return costType;
    }

    public final void setCostType(final Integer value) {
        costType = value;
    }

    public final String getCostTypeStr() {
        return costTypeStr;
    }

    public final void setCostTypeStr(final String value) {
        costTypeStr = value;
    }

    public final List<String> getImages() {
        return Collections.unmodifiableList(images);
    }

    public final void setImages(final String... value) {
        images = Arrays.asList(value);
    }

    public final SkillsInfo getSkills() {
        return skills;
    }

    public final void setSkills(final SkillsInfo value) {
        skills = value;
    }

    public final List<String> getLearns() {
        return Collections.unmodifiableList(learns);
    }

    public final void setLearns(final String... value) {
        learns = Arrays.asList(value);
    }

    public final List<String> getStats() {
        return Collections.unmodifiableList(stats);
    }

    public final void setStats(final List<String> value) {
        stats = value;
    }
}
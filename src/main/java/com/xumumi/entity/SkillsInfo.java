package com.xumumi.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 技能信息类
 *
 * @author xumumi
 */
public class SkillsInfo {
    private List<Skill> passives;
    private List<Skill> learns;
    private Integer slots;

    public final List<Skill> getPassives() {
        return Collections.unmodifiableList(passives);
    }

    public final void setPassives(final Skill... value) {
        passives = Arrays.asList(value);
    }

    public final List<Skill> getLearns() {
        return Collections.unmodifiableList(learns);
    }

    public final void setLearns(final Skill... value) {
        learns = Arrays.asList(value);
    }

    public final Integer getSlots() {
        return slots;
    }

    public final void setSlots(final Integer value) {
        slots = value;
    }
}
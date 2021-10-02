package com.xumumi.entity.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xumumi.entity.Base;
import com.xumumi.entity.Skill;

sealed class Character extends Base permits Class, Specialization {
    @JsonProperty("female_name")
    private String femaleName;
    private Double price;
    private String[] images;
    private SkillsInfo skills;

    public final String getFemaleName() {
        return femaleName;
    }

    public final void setFemaleName(final String value) {
        femaleName = value;
    }

    public final Double getPrice() {
        return price;
    }

    public final void setPrice(final Double value) {
        price = value;
    }

    public final String[] getImages() {
        return images;
    }

    public final void setImages(final String[] value) {
        images = value;
    }

    public final SkillsInfo getSkills() {
        return skills;
    }

    public final void setSkills(final SkillsInfo value) {
        skills = value;
    }

    /**
     * 职业的技能信息类，包含被动，可学习技能和槽位
     *
     * @author xumumi
     */
    static final class SkillsInfo {
        private Skill[] passives;
        private Skill[] learns;
        private Integer slots;

        public Skill[] getPassives() {
            return passives;
        }

        public void setPassives(final Skill[] value) {
            passives = value;
        }

        public Skill[] getLearns() {
            return learns;
        }

        public void setLearns(final Skill[] value) {
            learns = value;
        }

        public Integer getSlots() {
            return slots;
        }

        public void setSlots(final Integer value) {
            slots = value;
        }
    }
}

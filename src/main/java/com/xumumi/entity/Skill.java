package com.xumumi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xumumi.OrnaGuideDataApplication;
import com.xumumi.entity.individual.Pet;
import com.xumumi.entity.influences.Buff;
import com.xumumi.entity.influences.Effect;
import com.xumumi.entity.individual.Monster;
import com.xumumi.enumerate.ElementType;
import com.xumumi.enumerate.SkillType;
import com.xumumi.repository.StatusesRepo;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.StringUtils.countOccurrencesOf;

/**
 * 技能类
 *
 * @author xumumi
 */
@SuppressWarnings("ClassWithTooManyFields")
public final class Skill extends Base {
    private SkillType type;
    @JsonProperty("is_magic")
    private boolean isMagic;
    private boolean bought;
    private Integer cost;
    private ElementType element;
    @JsonProperty("mana_cost")
    private Integer manaCost;
    private Effect[] causes;
    private Effect[] gives;
    private Effect[] cures;
    @JsonProperty("buffed_by")
    private Monster[] buffedBy;
    @JsonProperty("learned_by")
    private Learner[] learnedBy;
    @JsonProperty("monsters_use")
    private Monster[] monstersUse;
    @JsonProperty("pets_use")
    private Pet[] petsUse;

    public SkillType getType() {
        return type;
    }

    public void setType(final String value) {
        type = SkillType.getEnum(value);
    }

    public boolean isMagic() {
        return isMagic;
    }

    public void setMagic(final boolean magic) {
        isMagic = magic;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(final boolean value) {
        bought = value;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(final Integer value) {
        cost = value;
    }

    public ElementType getElement() {
        return element;
    }

    public void setElement(final String value) {
        element = ElementType.valueOf(value);
    }

    public Integer getManaCost() {
        return manaCost;
    }

    public void setManaCost(final Integer value) {
        manaCost = value;
    }

    /**
     * 根据字符串内容生成 {@link Buff} 对象
     *
     * @param value 原始字符串内容
     * @return {@link Buff} 对象
     */
    private static Buff getBuff(@NonNull final String value) {
        final String[] snippets = value.split(" ");
        return switch (snippets.length) {
            case 3 -> new Buff(
                    snippets[1],
                    true,
                    countOccurrencesOf(snippets[2], "↑") - countOccurrencesOf(snippets[2], "↓")
            );
            case 2 -> new Buff(
                    snippets[0],
                    false,
                    countOccurrencesOf(snippets[1], "↑") - countOccurrencesOf(snippets[1], "↓")
            );
            default -> throw new IllegalStateException("Unexpected value: %s".formatted(value));
        };
    }

    /**
     * 将字符串数组转为 {@link Effect} 数组
     *
     * @param value 字符串数组
     * @return {@link Effect}数组
     */
    private static Effect[] getEffects(final String[] value) {
        Effect[] ret = null;
        if (null != value) {
            final StatusesRepo statusesRepo = OrnaGuideDataApplication.context.getBean(StatusesRepo.class);
            final List<Effect> effects = new ArrayList<>(0);
            for (final String name : value) {
                Effect effect = statusesRepo.findByName(name);
                if (null == effect) {
                    effect = getBuff(name);
                }
                effects.add(effect);
            }
            //noinspection ZeroLengthArrayAllocation
            ret = effects.toArray(new Effect[0]);
        }
        return ret;
    }

    public Effect[] getCauses() {
        return causes;
    }

    public void setCauses(final String[] value) {
        causes = getEffects(value);
    }

    public Effect[] getGives() {
        return gives;
    }

    public void setGives(final String[] value) {
        gives = getEffects(value);
    }

    public Effect[] getCures() {
        return cures;
    }

    public void setCures(final String[] value) {
        cures = getEffects(value);
    }

    public Monster[] getBuffedBy() {
        return buffedBy;
    }

    public void setBuffedBy(final Monster[] value) {
        buffedBy = value;
    }

    public Learner[] getLearnedBy() {
        return learnedBy;
    }

    public void setLearnedBy(final Learner[] value) {
        learnedBy = value;
    }

    public Monster[] getMonstersUse() {
        return monstersUse;
    }

    public void setMonstersUse(final Monster[] value) {
        monstersUse = value;
    }

    public Pet[] getPetsUse() {
        return petsUse;
    }

    public void setPetsUse(final Pet[] value) {
        petsUse = value;
    }

    private static final class Learner {
        public Integer id;
        public String name;
        public Integer level;
        public boolean specialization;
    }
}

package com.xumumi.entity;

import com.xumumi.enumerate.SkillType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 技能类
 *
 * @author xumumi
 */
public class Skill extends Base {
    private SkillType type;
    private boolean isMagic;
    private boolean bought;
    private Integer manaCost;
    private String causes;
    private List<Class> learnedBy;
    private List<Monster> monstersUse;

    public final SkillType getType() {
        return type;
    }

    public final void setType(final SkillType value) {
        type = value;
    }

    public final boolean isMagic() {
        return isMagic;
    }

    public final void setMagic(final boolean magic) {
        isMagic = magic;
    }

    public final boolean isBought() {
        return bought;
    }

    public final void setBought(final boolean value) {
        bought = value;
    }

    public final Integer getManaCost() {
        return manaCost;
    }

    public final void setManaCost(final Integer value) {
        manaCost = value;
    }

    public final String getCauses() {
        return causes;
    }

    public final void setCauses(final String value) {
        causes = value;
    }

    public final List<Class> getLearnedBy() {
        return Collections.unmodifiableList(learnedBy);
    }

    public final void setLearnedBy(final Class... value) {
        learnedBy = Arrays.asList(value);
    }

    public final List<Monster> getMonstersUse() {
        return Collections.unmodifiableList(monstersUse);
    }

    public final void setMonstersUse(final Monster... value) {
        monstersUse = Arrays.asList(value);
    }
}

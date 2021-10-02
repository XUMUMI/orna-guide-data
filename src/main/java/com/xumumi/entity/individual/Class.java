package com.xumumi.entity.individual;

import com.xumumi.entity.Base;

import java.util.Arrays;

/**
 * 职业类型
 *
 * @author xumumi
 */
public final class Class extends Character {
    private String learns;
    private String[] stats;

    public String getLearns() {
        return learns;
    }

    public void setLearns(final String value) {
        learns = value;
    }

    public String[] getStats() {
        return stats;
    }

    public void setStats(final String[] value) {
        stats = value;
    }

    @Override
    public String toString() {
        final Integer[] passivesIds = Arrays.stream(getSkills().getPassives()).map(Base::getId).toArray(Integer[]::new);
        final Integer[] learnsIds = Arrays.stream(getSkills().getLearns()).map(Base::getId).toArray(Integer[]::new);
        return String.format(
                "%d\t%s",
                getId(),Arrays.toString(passivesIds));
    }
}

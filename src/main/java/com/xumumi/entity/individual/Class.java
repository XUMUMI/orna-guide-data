package com.xumumi.entity.individual;

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
}

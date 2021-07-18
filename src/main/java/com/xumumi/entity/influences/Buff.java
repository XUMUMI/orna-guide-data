package com.xumumi.entity.influences;

/**
 * Buff 状态，分为属性、是否临时 buff 和 强度 三个部分
 *
 * @author xumumi
 */
public final class Buff implements Effect {
    private String attributes;
    private boolean temporarily;
    private Integer intensity;

    public Buff(final String attr, final Boolean temp, final int num) {
        attributes = attr;
        temporarily = temp;
        intensity = num;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(final String value) {
        attributes = value;
    }

    public boolean isTemporarily() {
        return temporarily;
    }

    public void setTemporarily(final boolean value) {
        temporarily = value;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public void setIntensity(final Integer value) {
        intensity = value;
    }
}

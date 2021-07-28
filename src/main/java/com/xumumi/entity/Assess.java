package com.xumumi.entity;

/**
 * 物品评估结果类型
 *
 * @author xumumi
 */
public final class Assess extends Item {
    private double quality;

    public double getQuality() {
        return quality;
    }

    public void setQuality(final double value) {
        quality = value;
    }
}

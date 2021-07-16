package com.xumumi.entity;

/**
 * 物品评估结果类型
 *
 * @author xumumi
 */
public class Assessment extends Item {
    private double quality;

    public final double getQuality() {
        return quality;
    }

    public final void setQuality(final double value) {
        quality = value;
    }
}

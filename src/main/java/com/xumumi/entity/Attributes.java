package com.xumumi.entity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 物品属性，比如血量、攻击、魔攻等
 *
 * @author xumumi
 */
public class Attributes {
    private Integer base;
    private List<Integer> values;

    public final Integer getBase() {
        return base;
    }

    public final void setBase(final Integer value) {
        base = value;
    }

    public final List<Integer> getValues() {
        return Collections.unmodifiableList(values);
    }

    public final void setValues(final Integer... value) {
        values = Arrays.asList(value);
    }
}

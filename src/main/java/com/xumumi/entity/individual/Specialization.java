package com.xumumi.entity.individual;

/**
 * 专精类
 *
 * @author xumumi
 */
public final class Specialization extends Character {
    private Boost[] boosts;

    public Boost[] getBoosts() {
        return boosts;
    }

    public void setBoosts(final Boost[] value) {
        boosts = value;
    }

    /**
     * 专精提升类
     *
     * @author xumumi
     */
    private static final class Boost {
        private String name;
        private Integer value;

        public String getName() {
            return name;
        }

        public void setName(final String label) {
            name = label;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(final Integer strength) {
            value = strength;
        }
    }
}

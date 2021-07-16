package com.xumumi.enumerate;

/**
 * 出现条件
 *
 * @author xumumi
 */
public enum Spawn {
    /**
     * 仅白天
     */
    Day("Day Only"),
    /**
     * 仅地城
     */
    Gauntlet("Gauntlet Only"),
    /**
     * 仅晚上
     */
    Night("Night Only"),
    /**
     * 仅副本
     */
    Raid("Raid"),
    /**
     * 仅水面
     */
    Water("Water Only");

    private final String name;

    Spawn(final String spawn) {
        name = spawn;
    }

    public String getName() {
        return name;
    }

    public static Spawn getEnum(final String value) {
        for (final Spawn spawn : values()) {
            if (spawn.name.equalsIgnoreCase(value)) {
                return spawn;
            }
        }
        throw new EnumNotFoundException(value);
    }

    @Override
    public String toString() {
        return name;
    }
}

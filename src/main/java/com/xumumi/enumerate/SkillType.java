package com.xumumi.enumerate;

/**
 * 技能类型枚举
 *
 * @author xumumi
 */
public enum SkillType {
    /**
     * 攻击
     */
    Attack("Attack"),
    Buff("Buff"),
    Dot("D.O.T."),
    Debuff("Debuff"),
    Magic("Magic"),
    MultiRoundAttack("Multi-round Attack"),
    MultiRoundMagic("Multi-round Magic"),
    Passive("Passive");

    private final String name;

    SkillType(final String type) {
        name = type;
    }

    public String getName() {
        return name;
    }

    public static SkillType getEnum(final String value) {
        for (final SkillType type : values()) {
            if (type.name.equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new EnumNotFoundException(value);
    }

    @Override
    public String toString() {
        return name;
    }
}

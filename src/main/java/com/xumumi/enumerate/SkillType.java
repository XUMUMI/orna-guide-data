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
    /**
     * 增益
     */
    Buff("Buff"),
    /**
     * 减益
     */
    Debuff("Debuff"),
    /**
     * 治疗
     */
    Healing("Healing"),
    /**
     * 魔法
     */
    Magic("Magic"),
    /**
     * 多轮攻击
     */
    MultiRoundAttack("Multi-round Attack"),
    /**
     * 多轮魔攻
     */
    MultiRoundMagic("Multi-round Magic"),
    /**
     * 被动
     */
    Passive("Passive"),
    /**
     * 防御
     */
    Ward("Ward"),
    /**
     * 其他
     */
    Other("Other");

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

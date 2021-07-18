package com.xumumi.enumerate;

/**
 * 物品类型枚举
 *
 * @author xumumi
 */
public enum ItemType {
    /**
     * 药水
     */
    Curative("Curative"),
    /**
     * 武器
     */
    Weapon("Weapon"),
    /**
     * 副手
     */
    OffHand("Off-hand"),
    /**
     * 头
     */
    Head("Head"),
    /**
     * 装甲
     */
    Armor("Armor"),
    /**
     * 腿部
     */
    Legs("Legs"),
    /**
     * 吊坠
     */
    Accessory("Accessory"),
    /**
     * 装饰品
     */
    Adornment("Adornment"),
    /**
     * 材料
     */
    Material("Material"),
    /**
     * 物品
     */
    Item("Item"),
    /**
     * 其他
     */
    Other("Other");

    private final String name;

    ItemType(final String type) {
        name = type;
    }

    public String getName() {
        return name;
    }

    public static ItemType getEnum(final String value) {
        for (final ItemType type : values()) {
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

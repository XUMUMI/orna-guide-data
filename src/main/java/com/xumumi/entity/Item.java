package com.xumumi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xumumi.entity.individual.Class;
import com.xumumi.entity.individual.Monster;
import com.xumumi.enumerate.ElementType;
import com.xumumi.enumerate.ItemType;

/**
 * 物品类
 *
 * @author xumumi
 */
public class Item extends Base {
    private ItemType type;
    private boolean boss;
    private boolean arena;
    private Stats stats;
    private ElementType element;
    @JsonProperty("view_distance")
    private boolean viewDistance;
    private Item[] materials;
    @JsonProperty("dropped_by")
    private Monster[] droppedBy;
    @JsonProperty("equipped_by")
    private Class[] equippedBy;
    private Quest[] quests;

    public final ItemType getType() {
        return type;
    }

    public final void setType(final String value) {
        type = ItemType.getEnum(value);
    }

    public final boolean isBoss() {
        return boss;
    }

    public final void setBoss(final boolean value) {
        boss = value;
    }

    public final boolean isArena() {
        return arena;
    }

    public final void setArena(final boolean value) {
        arena = value;
    }

    public final Stats getStats() {
        return stats;
    }

    public final void setStats(final Stats value) {
        stats = value;
    }

    public final ElementType getElement() {
        return element;
    }

    public final void setElement(final ElementType value) {
        element = value;
    }

    public final boolean isViewDistance() {
        return viewDistance;
    }

    public final void setViewDistance(final boolean value) {
        viewDistance = value;
    }

    public final Item[] getMaterials() {
        return materials;
    }

    public final void setMaterials(final Item[] value) {
        materials = value;
    }

    public final Monster[] getDroppedBy() {
        return droppedBy;
    }

    public final void setDroppedBy(final Monster[] value) {
        droppedBy = value;
    }

    public final Class[] getEquippedBy() {
        return equippedBy;
    }

    public final void setEquippedBy(final Class[] value) {
        equippedBy = value;
    }

    public final Quest[] getQuests() {
        return quests;
    }

    public final void setQuests(final Quest[] value) {
        quests = value;
    }

    /**
     * 属性统计类
     *
     * @author xumumi
     */
    private static class Stats {
        private Attributes attack;
        private Attributes crit;
        private Attributes defense;
        private Attributes dexterity;
        private Attributes hp;
        private Attributes magic;
        private Attributes mana;
        private Attributes resistance;
        private Attributes ward;

        public final Attributes getAttack() {
            return attack;
        }

        public final void setAttack(final Attributes value) {
            attack = value;
        }

        public final Attributes getCrit() {
            return crit;
        }

        public final void setCrit(final Attributes value) {
            crit = value;
        }

        public final Attributes getDefense() {
            return defense;
        }

        public final void setDefense(final Attributes value) {
            defense = value;
        }

        public final Attributes getDexterity() {
            return dexterity;
        }

        public final void setDexterity(final Attributes value) {
            dexterity = value;
        }

        public final Attributes getHp() {
            return hp;
        }

        public final void setHp(final Attributes value) {
            hp = value;
        }

        public final Attributes getMagic() {
            return magic;
        }

        public final void setMagic(final Attributes value) {
            magic = value;
        }

        public final Attributes getMana() {
            return mana;
        }

        public final void setMana(final Attributes value) {
            mana = value;
        }

        public final Attributes getResistance() {
            return resistance;
        }

        public final void setResistance(final Attributes value) {
            resistance = value;
        }

        public final Attributes getWard() {
            return ward;
        }

        public final void setWard(final Attributes value) {
            ward = value;
        }

        /**
         * 物品属性，比如血量、攻击、魔攻等
         *
         * @author xumumi
         */
        @SuppressWarnings("InnerClassTooDeeplyNested")
        private static class Attributes {
            private Integer base;
            private Integer[] values;

            public final Integer getBase() {
                return base;
            }

            public final void setBase(final Integer value) {
                base = value;
            }

            public final Integer[] getValues() {
                return values;
            }

            public final void setValues(final Integer[] value) {
                values = value;
            }
        }
    }
}

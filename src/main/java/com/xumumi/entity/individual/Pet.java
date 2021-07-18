package com.xumumi.entity.individual;

import com.xumumi.entity.Base;
import com.xumumi.entity.Skill;

/**
 * 宠物类
 *
 * @author xumumi
 */
public final class Pet extends Base {
    private Integer cost;
    private Stats stats;
    private Skill[] skills;

    public Integer getCost() {
        return cost;
    }

    public void setCost(final Integer value) {
        cost = value;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(final Stats value) {
        stats = value;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(final Skill[] value) {
        skills = value;
    }

    /**
     * 宠物属性，比如血量、攻击、魔攻等
     *
     * @author xumumi
     */
    private static final class Stats {
        private Integer attack;
        private Integer crit;
        private Integer defense;
        private Integer dexterity;
        private Integer hp;
        private Integer magic;
        private Integer mana;
        private Integer resistance;
        private Integer ward;

        public Integer getAttack() {
            return attack;
        }

        public void setAttack(final Integer value) {
            attack = value;
        }

        public Integer getCrit() {
            return crit;
        }

        public void setCrit(final Integer value) {
            crit = value;
        }

        public Integer getDefense() {
            return defense;
        }

        public void setDefense(final Integer value) {
            defense = value;
        }

        public Integer getDexterity() {
            return dexterity;
        }

        public void setDexterity(final Integer value) {
            dexterity = value;
        }

        public Integer getHp() {
            return hp;
        }

        public void setHp(final Integer value) {
            hp = value;
        }

        public Integer getMagic() {
            return magic;
        }

        public void setMagic(final Integer value) {
            magic = value;
        }

        public Integer getMana() {
            return mana;
        }

        public void setMana(final Integer value) {
            mana = value;
        }

        public Integer getResistance() {
            return resistance;
        }

        public void setResistance(final Integer value) {
            resistance = value;
        }

        public Integer getWard() {
            return ward;
        }

        public void setWard(final Integer value) {
            ward = value;
        }
    }
}

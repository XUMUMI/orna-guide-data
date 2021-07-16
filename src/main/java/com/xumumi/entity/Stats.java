package com.xumumi.entity;

/**
 * 属性统计类
 *
 * @author xumumi
 */
public class Stats {
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
}

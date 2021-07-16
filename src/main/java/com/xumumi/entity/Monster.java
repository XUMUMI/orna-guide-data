package com.xumumi.entity;

import com.xumumi.enumerate.ElementType;
import com.xumumi.enumerate.Spawn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 魔物类
 *
 * @author xumumi
 */
@SuppressWarnings("unused")
public class Monster extends Base {
    private boolean boss;
    private Integer level;
    private List<Spawn> spawns;
    private List<ElementType> weakTo;
    private List<ElementType> resistantTo;
    private List<ElementType> immuneTo;
    private List<Item> drops;
    private List<Skill> skills;
    private List<Quest> quests;
    private List<Skill> buffs;

    public final boolean isBoss() {
        return boss;
    }

    public final void setBoss(final boolean value) {
        boss = value;
    }

    public final Integer getLevel() {
        return level;
    }

    public final void setLevel(final Integer value) {
        level = value;
    }

    public final List<Spawn> getSpawns() {
        return Collections.unmodifiableList(spawns);
    }

    public final void setSpawns(final String[] spawnList) {
        spawns = new ArrayList<>(16);
        for (final String spawn : spawnList) {
            spawns.add(Spawn.getEnum(spawn));
        }
    }

    public final List<ElementType> getWeakTo() {
        return Collections.unmodifiableList(weakTo);
    }

    public final void setWeakTo(final String[] elements) {
        weakTo = new ArrayList<>(16);
        for (final String element : elements) {
            weakTo.add(ElementType.valueOf(element));
        }
    }

    public final List<ElementType> getResistantTo() {
        return Collections.unmodifiableList(resistantTo);
    }

    public final void setResistantTo(final String[] elements) {
        resistantTo = new ArrayList<>(16);
        for (final String element : elements) {
            resistantTo.add(ElementType.valueOf(element));
        }
    }

    public final List<ElementType> getImmuneTo() {
        return Collections.unmodifiableList(immuneTo);
    }

    public final void setImmuneTo(final String[] elements) {
        immuneTo = new ArrayList<>(16);
        for (final String element : elements) {
            immuneTo.add(ElementType.valueOf(element));
        }
    }

    public final List<Item> getDrops() {
        return Collections.unmodifiableList(drops);
    }

    public final void setDrops(final Item... value) {
        drops = Arrays.asList(value);
    }

    public final List<Skill> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    public final void setSkills(final Skill... value) {
        skills = Arrays.asList(value);
    }

    public final List<Quest> getQuests() {
        return Collections.unmodifiableList(quests);
    }

    public final void setQuests(final Quest... value) {
        quests = Arrays.asList(value);
    }

    public final List<Skill> getBuffs() {
        return Collections.unmodifiableList(buffs);
    }

    public final void setBuffs(final Skill... value) {
        buffs = Arrays.asList(value);
    }
}

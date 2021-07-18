package com.xumumi.entity.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xumumi.entity.Base;
import com.xumumi.entity.Item;
import com.xumumi.entity.Quest;
import com.xumumi.entity.Skill;
import com.xumumi.enumerate.ElementType;
import com.xumumi.enumerate.Spawn;

import java.util.Arrays;

/**
 * 魔物类
 *
 * @author xumumi
 */
@SuppressWarnings("unused")
public final class Monster extends Base {
    private boolean boss;
    private Integer level;
    private Spawn[] spawns;
    @JsonProperty("weak_to")
    private ElementType[] weakTo;
    @JsonProperty("resistant_to")
    private ElementType[] resistantTo;
    @JsonProperty("immune_to")
    private ElementType[] immuneTo;
    private Item[] drops;
    private Skill[] skills;
    private Quest[] quests;
    private Skill[] buffs;

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(final boolean value) {
        boss = value;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(final Integer value) {
        level = value;
    }

    public Spawn[] getSpawns() {
        return spawns;
    }

    public void setSpawns(final String[] spawnList) {
        spawns = Arrays.stream(spawnList).map(Spawn::getEnum).toArray(Spawn[]::new);
    }

    public ElementType[] getWeakTo() {
        return weakTo;
    }

    public void setWeakTo(final String[] elements) {
        weakTo = Arrays.stream(elements).map(ElementType::valueOf).toArray(ElementType[]::new);
    }

    public ElementType[] getResistantTo() {
        return resistantTo;
    }

    public void setResistantTo(final String[] elements) {
        resistantTo = Arrays.stream(elements).map(ElementType::valueOf).toArray(ElementType[]::new);
    }

    public ElementType[] getImmuneTo() {
        return immuneTo;
    }

    public void setImmuneTo(final String[] elements) {
        immuneTo = Arrays.stream(elements).map(ElementType::valueOf).toArray(ElementType[]::new);
    }

    public Item[] getDrops() {
        return drops;
    }

    public void setDrops(final Item[] value) {
        drops = value;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(final Skill[] value) {
        skills = value;
    }

    public Quest[] getQuests() {
        return quests;
    }

    public void setQuests(final Quest[] value) {
        quests = value;
    }

    public Skill[] getBuffs() {
        return buffs;
    }

    public void setBuffs(final Skill[] value) {
        buffs = value;
    }
}

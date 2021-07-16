package com.xumumi.entity;

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
    private boolean viewDistance;
    private Item[] materials;
    private Monster[] droppedBy;
    private Class[] equippedBy;
    private Quest[] quests;

    public ItemType getType() {
        return type;
    }

    public void setType(String type) {
        this.type = ItemType.getEnum(type);
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public boolean isArena() {
        return arena;
    }

    public void setArena(boolean arena) {
        this.arena = arena;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public ElementType getElement() {
        return element;
    }

    public void setElement(ElementType element) {
        this.element = element;
    }

    public boolean isViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(boolean viewDistance) {
        this.viewDistance = viewDistance;
    }

    public Item[] getMaterials() {
        return materials;
    }

    public void setMaterials(Item[] materials) {
        this.materials = materials;
    }

    public Monster[] getDroppedBy() {
        return droppedBy;
    }

    public void setDroppedBy(Monster[] droppedBy) {
        this.droppedBy = droppedBy;
    }

    public Class[] getEquippedBy() {
        return equippedBy;
    }

    public void setEquippedBy(Class[] equippedBy) {
        this.equippedBy = equippedBy;
    }

    public Quest[] getQuests() {
        return quests;
    }

    public void setQuests(Quest[] quests) {
        this.quests = quests;
    }
}

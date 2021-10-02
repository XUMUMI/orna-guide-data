package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
import com.xumumi.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Item}
 *
 * @author xumumi
 */
@Component
public class ItemRepo extends OrnaRepository<Item> {
    @Autowired
    public ItemRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Item.class);
    }
}

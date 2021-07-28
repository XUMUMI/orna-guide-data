package com.xumumi.repository;

import com.xumumi.Config;
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
    public ItemRepo(final Config config) {
        super(config, Item.class);
    }
}

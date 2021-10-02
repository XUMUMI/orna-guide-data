package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
import com.xumumi.entity.individual.Monster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Monster}
 *
 * @author xumumi
 */
@Component
public class MonsterRepo extends OrnaRepository<Monster> {
    @Autowired
    public MonsterRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Monster.class);
    }
}

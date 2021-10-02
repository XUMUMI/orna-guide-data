package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
import com.xumumi.entity.Assess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Assess}
 *
 * @author xumumi
 */
@Component
public class AssessRepo extends OrnaRepository<Assess> {
    @Autowired
    public AssessRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Assess.class);
    }
}

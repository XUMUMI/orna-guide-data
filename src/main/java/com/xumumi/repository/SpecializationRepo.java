package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
import com.xumumi.entity.individual.Specialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Specialization}
 *
 * @author xumumi
 */
@Component
public class SpecializationRepo extends OrnaRepository<Specialization> {
    @Autowired
    public SpecializationRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Specialization.class);
    }
}

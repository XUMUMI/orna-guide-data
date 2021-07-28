package com.xumumi.repository;

import com.xumumi.Config;
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
    public SpecializationRepo(final Config config) {
        super(config, Specialization.class);
    }
}

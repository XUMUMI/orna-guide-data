package com.xumumi.repository;

import com.xumumi.Config;
import com.xumumi.entity.individual.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Class}
 *
 * @author xumumi
 */
@Component
public class ClassRepo extends OrnaRepository<Class> {
    @Autowired
    public ClassRepo(final Config config) {
        super(config, Class.class);
    }
}

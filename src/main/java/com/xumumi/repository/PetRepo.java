package com.xumumi.repository;

import com.xumumi.Config;
import com.xumumi.entity.individual.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Pet}
 *
 * @author xumumi
 */
@Component
public class PetRepo extends OrnaRepository<Pet> {
    @Autowired
    public PetRepo(final Config config) {
        super(config, Pet.class);
    }
}

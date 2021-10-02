package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
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
    public PetRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Pet.class);
    }
}

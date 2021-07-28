package com.xumumi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xumumi.entity.Item;
import com.xumumi.repository.ItemRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class Weapon {
    @Resource
    private ItemRepo itemRepo;

    @GetMapping("weapon")
    public final Item[] selectWeaponByName(@RequestParam final String name) throws JsonProcessingException {
        return itemRepo.select(Map.of(
                "name", name,
                "type", "Weapon"
        ));
    }
}

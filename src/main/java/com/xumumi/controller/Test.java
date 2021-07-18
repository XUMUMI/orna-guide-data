package com.xumumi.controller;

import com.xumumi.entity.Item;
import com.xumumi.entity.Skill;
import com.xumumi.entity.individual.Class;
import com.xumumi.entity.individual.Monster;
import com.xumumi.entity.individual.Pet;
import com.xumumi.entity.individual.Specialization;
import com.xumumi.entity.influences.Status;
import com.xumumi.repository.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
public class Test {
    @Resource
    private ClassRepo classRepo;

    @RequestMapping("class")
    public final Class ornaClass() {
        return classRepo.getById(1);
    }

    @Resource
    private ItemRepo itemRepo;

    @RequestMapping("item")
    public final Item ornaItem() {
        return itemRepo.getById(1);
    }

    @Resource
    private MonsterRepo monsterRepo;

    @RequestMapping("monster")
    public final Monster ornaMonster() {
        return monsterRepo.getById(1);
    }

    @Resource
    private PetRepo petRepo;

    @RequestMapping("pet")
    public final Pet ornaPet() {
        return petRepo.getById(1);
    }

    @Resource
    private SkillRepo skillRepo;

    @RequestMapping("skill")
    public final Skill ornaSkill() {
        return skillRepo.getById(1);
    }

    @Resource
    private SpecializationRepo specializationRepo;

    @RequestMapping("specialization")
    public final Specialization ornaSpecialization() {
        return specializationRepo.getById(55);
    }

    @Resource
    private StatusesRepo statusesRepo;

    @RequestMapping("status")
    public final Status status() {
        return statusesRepo.getById(1);
    }
}
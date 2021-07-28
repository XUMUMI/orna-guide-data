package com.xumumi.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xumumi.entity.Assess;
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
import java.util.Map;

/**
 * 用于测试接口的 Controller
 *
 * @author xumumi
 */
@RestController
@RequestMapping("test")
public class Test {
    @Resource
    private AssessRepo assessRepo;

    @RequestMapping("assess")
    public final Assess ornaAssess() throws JsonProcessingException {
        return assessRepo.selectOne(Map.of(
                "name", "Gadget",
                "defense", 10,
                "resistance", 10
        ));
    }

    @Resource
    private ClassRepo classRepo;

    @RequestMapping("class")
    public final Class ornaClass() throws JsonProcessingException {
        return classRepo.getById(1);
    }

    @Resource
    private ItemRepo itemRepo;

    @RequestMapping("item")
    public final Item ornaItem() throws JsonProcessingException {
        return itemRepo.getById(1);
    }

    @Resource
    private MonsterRepo monsterRepo;

    @RequestMapping("monster")
    public final Monster ornaMonster() throws JsonProcessingException {
        return monsterRepo.getById(1);
    }

    @Resource
    private PetRepo petRepo;

    @RequestMapping("pet")
    public final Pet ornaPet() throws JsonProcessingException {
        return petRepo.getById(1);
    }

    @Resource
    private SkillRepo skillRepo;

    @RequestMapping("skill")
    public final Skill ornaSkill() throws JsonProcessingException {
        return skillRepo.getById(1);
    }

    @Resource
    private SpecializationRepo specializationRepo;

    @SuppressWarnings("MagicNumber")
    @RequestMapping("specialization")
    public final Specialization ornaSpecialization() throws JsonProcessingException {
        return specializationRepo.getById(55);
    }

    @Resource
    private StatusesRepo statusesRepo;

    @RequestMapping("status")
    public final Status status() {
        return statusesRepo.getById(1);
    }
}
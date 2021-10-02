package com.xumumi.repository;

import com.xumumi.config.OrnaConfig;
import com.xumumi.entity.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 从远程获取 {@link Skill}
 *
 * @author xumumi
 */
@Component
public class SkillRepo extends OrnaRepository<Skill> {
    @Autowired
    public SkillRepo(final OrnaConfig ornaConfig) {
        super(ornaConfig, Skill.class);
    }
}

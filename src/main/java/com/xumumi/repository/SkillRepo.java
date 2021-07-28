package com.xumumi.repository;

import com.xumumi.Config;
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
    public SkillRepo(final Config config) {
        super(config, Skill.class);
    }
}

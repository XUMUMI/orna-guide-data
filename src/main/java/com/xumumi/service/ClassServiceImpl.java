package com.xumumi.service;

import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.xumumi.entity.dao.Class;
import com.xumumi.entity.dao.ClassName;
import com.xumumi.entity.dao.ClassPng;
import com.xumumi.repository.ClassNameRepo;
import com.xumumi.repository.ClassPngRepo;
import com.xumumi.repository.ClassRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 职业对象服务实现
 *
 * @author xumumi
 */
@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassRepo classRepo;
    @Resource
    private ClassNameRepo classNameRepo;
    @Resource
    private ClassPngRepo classPngRepo;

    @Override
    public final Class get(final Integer id) {
        return classRepo.getById(id);
    }

    /**
     * 通过职业名模糊查找职业
     *
     * @param name 职业名
     * @return 所有符合条件的职业对象
     */
    @Override
    public final ClassName[] search(final String name) {
        final String nameSp = ZhConverterUtil.toSimple(name);
        return classNameRepo.findByNameLikeOrNameCnLikeOrFemaleNameLikeOrFemaleNameCnLikeOrderById(
                "%%%s%%".formatted(nameSp),
                "%%%s%%".formatted(nameSp),
                "%%%s%%".formatted(nameSp),
                "%%%s%%".formatted(nameSp)
        );
    }

    /**
     * 通过职业 ID 获取对应的所有图片
     *
     * @param id 职业 ID
     * @return 图片数组
     */
    @Override
    public final ClassPng[] getImages(final Integer id) {
        return classPngRepo.findAllByClassId(id);
    }

    /**
     * 通过职业 ID 获取对应的默认图片
     *
     * @param id 职业 ID
     * @return 单个图片对象
     */
    @Override
    public final ClassPng getImage(final Integer id) {
        return classPngRepo.findOneByClassIdAndUrlLike(id, "%default_m%");
    }
}

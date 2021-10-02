package com.xumumi.repository;

import com.xumumi.entity.dao.Class;
import com.xumumi.entity.dao.ClassPng;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 从数据库获取 {@link Class}
 *
 * @author xumumi
 */
@Repository
public interface ClassPngRepo extends JpaRepository<ClassPng, Integer> {
    /**
     * 通过职业 ID 查找图片
     *
     * @param id 职业 ID
     * @return {@link Class} 对象
     */
    ClassPng[] findAllByClassId(Integer id);

    /**
     * 通过 ID 和限定链接内容获取图片
     *
     * @param id   职业 ID
     * @param like 链接限定
     * @return 单个图片对象
     */
    ClassPng findOneByClassIdAndUrlLike(Integer id, String like);
}

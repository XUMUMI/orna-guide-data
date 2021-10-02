package com.xumumi.repository;

import com.xumumi.entity.dao.Class;
import com.xumumi.entity.dao.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 从数据库获取 {@link Class}
 *
 * @author xumumi
 */
@Repository
public interface ClassNameRepo extends JpaRepository<ClassName, Integer> {
     /**
     * 通过英文名或中文名模糊查找职业
     *
     * @param name         英文名
     * @param nameCn       中文名
     * @param femaleName   女性英文名
     * @param femaleNameCn 女性中文名
     * @return 符合条件的所有职业
     */
     ClassName[] findByNameLikeOrNameCnLikeOrFemaleNameLikeOrFemaleNameCnLikeOrderById(
            String name,
            String nameCn,
            String femaleName,
            String femaleNameCn
    );
}

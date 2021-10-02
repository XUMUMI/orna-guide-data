package com.xumumi.repository;

import com.xumumi.entity.dao.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 从数据库获取 {@link Class}
 *
 * @author xumumi
 */
@Repository
public interface ClassRepo extends JpaRepository<Class, Integer> {
}

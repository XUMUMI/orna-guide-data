package com.xumumi.repository;

import com.xumumi.entity.influences.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 从数据库获取 {@link Status}
 *
 * @author xumumi
 */
@Repository
public interface StatusesRepo extends JpaRepository<Status, Integer> {
    /**
     * 通过名字查找对象
     *
     * @param name 名
     * @return {@link Status} 对象
     */
    Status findByName(String name);
}

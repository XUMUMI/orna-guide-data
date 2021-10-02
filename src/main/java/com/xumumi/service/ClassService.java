package com.xumumi.service;

import com.xumumi.entity.dao.ClassName;
import com.xumumi.entity.dao.Class;
import com.xumumi.entity.dao.ClassPng;

/**
 * 职业对象服务接口
 *
 * @author xumumi
 */
public interface ClassService {
    /**
     * 通过 ID 获取一个职业对象
     *
     * @param id 请求 ID
     * @return 职业对象
     */
    Class get(Integer id);

    /**
     * 通过职业名模糊查找职业
     *
     * @param name 职业名
     * @return 所有符合条件的职业对象
     */
    ClassName[] search(String name);

    /**
     * 通过职业 ID 获取对应的所有图片
     *
     * @param id 职业 ID
     * @return 图片数组
     */
    ClassPng[] getImages(Integer id);

    /**
     * 通过职业 ID 获取对应的默认图片
     *
     * @param id 职业 ID
     * @return 单个图片对象
     */
    ClassPng getImage(Integer id);
}

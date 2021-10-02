package com.xumumi.controller;

import com.xumumi.entity.dao.Class;
import com.xumumi.entity.dao.ClassBase;
import com.xumumi.service.ClassService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用于测试接口的 Controller
 *
 * @author xumumi
 */
@RestController
@RequestMapping("class")
public class ClassController {
    @Resource
    private ClassService classService;

    @GetMapping("{id}")
    public final Class searchClass(@PathVariable final Integer id) {
//        return classService.getById(id);
        return null;
    }

    @GetMapping("search")
    public final ClassBase[] searchClass(@RequestParam final String name) {
        System.out.println(name);
        return classService.search(name);
    }
}
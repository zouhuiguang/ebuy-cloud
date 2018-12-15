package com.ebuy.cloud.service.product.serviceproduct.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ebuy.cloud.service.product.serviceproduct.entity.User;
import com.ebuy.cloud.service.product.serviceproduct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Enten
 * @since 2018-12-07
 */
@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${version}")
    private String version;

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public String save() {
        try {
            User user = new User();
            user.setUsername("hello");
            user.setPassword("world");
            user.setPhone("10086");
            user.setRealname("zhangsan");
            userService.save(user);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PostMapping("/list")
    public Object list(@RequestBody JSONObject data) {
        Integer pageNum = data.getInteger("pageNum");
        Integer pageSize = data.getInteger("pageSize");

        QueryWrapper<User> queryWrapper = new QueryWrapper<User>().orderByDesc("id");
        return userService.page(new Page<>(pageNum == null ? 1 : pageNum, pageSize == null ? 2 : pageSize), queryWrapper);
    }

    @PostMapping("/multi")
    public Object multi(@RequestBody JSONObject data) {
        Integer pageNum = data.getInteger("pageNum");
        Integer pageSize = data.getInteger("pageSize");
        Integer score = data.getInteger("score");
        return userService.selectUserListPage(score, pageNum == null ? 1 : pageNum, pageSize == null ? 2 : pageSize);
    }

    @PostMapping("/update")
    public Object update(@RequestBody  User user) {
        try {
            userService.saveOrUpdate(user);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/config")
    public String testConfig() {
        return version;
    }

}

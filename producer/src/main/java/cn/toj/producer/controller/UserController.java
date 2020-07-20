package cn.toj.producer.controller;

import cn.toj.producer.dao.User;
import cn.toj.producer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/20
 */

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/findByUsername")
    public User findById(@RequestBody String username) {
        return userService.selectByUsername(username);
    }

}

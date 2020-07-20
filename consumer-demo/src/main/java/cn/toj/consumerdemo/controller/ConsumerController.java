package cn.toj.consumerdemo.controller;

import cn.toj.consumerdemo.dao.User;
import cn.toj.consumerdemo.reposity.ConsumerClient;
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
public class ConsumerController {

    @Autowired
    private ConsumerClient consumerClient;

    @PostMapping("/getUser")
    public User getUser(@RequestBody String username) {
        return consumerClient.getUser(username);
    }

}

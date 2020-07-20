package cn.toj.producer.service.impl;

import cn.toj.producer.dao.User;
import cn.toj.producer.mapper.UserMapper;
import cn.toj.producer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Carlos
 * @description
 * @Date 2020/7/20
 */

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        System.out.println(username);
        return userMapper.selectByUsername(username);
    }
}

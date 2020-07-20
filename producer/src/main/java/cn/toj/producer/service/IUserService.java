package cn.toj.producer.service;

import cn.toj.producer.dao.User;

public interface IUserService {

    /**
     * 根据username返回用户信息
     * @param username
     * @return
     */
    User selectByUsername(String username);

}

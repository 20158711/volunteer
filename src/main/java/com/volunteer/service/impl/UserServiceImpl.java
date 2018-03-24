package com.volunteer.service.impl;

import com.volunteer.dao.UserDao;
import com.volunteer.pojo.User;
import com.volunteer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByLoginNameAndPassword(String loginName, String password) {
        return userDao.findByLoginNameAndPassword(loginName, password);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findById(Long id) {
        return userDao.findById(id).get();
    }
}

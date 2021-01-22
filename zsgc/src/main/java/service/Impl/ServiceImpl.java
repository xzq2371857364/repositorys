package service.Impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.User;
import service.Service;

import java.util.List;

public class ServiceImpl implements Service {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }

    @Override
    public void edit(User user) {
        userMapper.edit(user);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}

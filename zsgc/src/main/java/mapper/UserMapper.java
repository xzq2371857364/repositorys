package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //显示所有信息方法
    List<User> findAll();
    //增加信息方法
    void add(User user);
    //删除方法
    void delete(int id);
    //修改方法
    void edit(User user);
    //查找id
    User findById(int id);

}

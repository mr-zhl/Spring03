package com.lanou.dao;


import com.lanou.pojo.User;

import java.util.List;

public interface UserDao {
    //数据库查询
    //添加用户
    int insert(String username,String password);

    //通过id,删除用户
    int deleted(int id);

    //通过id,修改用户密码
    int mode(String password,int id);

    //通过id,查询某个用户
    User selectOne(int id);
    //查询所有用户
    List<User> selectALl(int id);

    //查询用户个数
    int selectcount(int id);
}

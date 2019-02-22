package com.lanou.dao.impl;

import com.lanou.dao.UserDao;
import com.lanou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDaoImpl implements UserDao {
    //容器会自动创建
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insert(String username, String password) {
        return jdbcTemplate.update("insert into user (username, password) values (?,?);", username, password);
    }

    public int deleted(int id) {
        return jdbcTemplate.update("delete from user where id=?", id);
    }

    public int mode(String password, int id) {
        return jdbcTemplate.update("update user set password=? where id=?", password, id);
    }

    public User selectOne(int id) {
        return jdbcTemplate.queryForObject("select * from user where id=?",new BeanPropertyRowMapper<User>(User.class),id);
    }

    public List<User> selectALl(int id) {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }

    public int selectcount(int id) {
        return Optional.ofNullable(jdbcTemplate.queryForObject("select count(id) from user",Integer.class)).orElse(0);
    }
}

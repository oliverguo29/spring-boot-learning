package com.ao.demo.service;

import com.ao.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //增
    public int addUser(User user){
        return  jdbcTemplate.update("insert into user(username, address) values(?,?)", user.getName(), user.getAddress());
    }

    //删
    public int deleteUser(User user){
        return jdbcTemplate.update("delete from user where id=?",user.getId());
    }

    //改
    public int updateUser(User user){
        return jdbcTemplate.update("update user set username=?, address=? where id =?",user.getName(),user.getAddress(),user.getId());
    }

    //查
    public List<User> getAllUser(){
        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                String userName = resultSet.getString("username");
                String address = resultSet.getString("address");
                int id = resultSet.getInt("id");
                User user = new User(id, userName, address );
                return user;
            }
        });
    }




}

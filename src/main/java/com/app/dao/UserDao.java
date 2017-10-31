package com.app.dao;


import com.app.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao{

    public List<User> getAll() throws Exception;

    public User getUserById(int id) throws Exception;

    public User getUserByUserName(String userName) throws Exception;

    public void deleteHeroByUserName(String userName) throws Exception;

    public void insertUser(User user) throws Exception;

    public void updatePasswordByEmail(String password) throws Exception;
}

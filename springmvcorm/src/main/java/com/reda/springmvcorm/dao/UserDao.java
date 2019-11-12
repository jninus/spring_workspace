package com.reda.springmvcorm.dao;

import java.util.List;

import com.reda.springmvcorm.entity.User;

public interface UserDao {

	int createUser(User user);

	List<User> findUsers();

	User findUser(int id);

}

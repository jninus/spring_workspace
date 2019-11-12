package com.reda.springmvcorm.services;

import java.util.List;

import com.reda.springmvcorm.entity.User;

public interface UserService {

	int save(User user);

	List<User> getUsers();

	User getUser(int id);

}

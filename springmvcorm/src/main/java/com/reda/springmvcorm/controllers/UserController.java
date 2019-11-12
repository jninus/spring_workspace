package com.reda.springmvcorm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reda.springmvcorm.entity.User;
import com.reda.springmvcorm.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User Created with Id :" + result);
		return "userReg";
	}

	@RequestMapping("/users")
	public String getUsers(ModelMap model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("/validateEmail")
	public @ResponseBody String validateEmail(@RequestParam(name = "id") int id) {

		User user = service.getUser(id);
		String msg = "";
		if (user != null) {
			msg = id + "Id Already in use";
		}
		return msg;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}

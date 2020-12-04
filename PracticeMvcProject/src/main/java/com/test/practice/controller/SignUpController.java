package com.test.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.practice.db.UserDao;
import com.test.practice.model.User;

@Controller
public class SignUpController {
	@Autowired
	private UserDao udao;
	@RequestMapping(value = "/signup",method = RequestMethod.GET)
	public String getSignUp()
	{
		return "signup";
	}
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
public String doSignUp(@ModelAttribute User u)
{
	u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
	udao.signup(u);
	return "login";
}
}

package com.test.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.practice.db.StudentDao;
import com.test.practice.db.UserDao;
import com.test.practice.model.User;

@Controller
public class LoginController {
	@Autowired
	private UserDao udao;
	
	@Autowired
	private StudentDao sdao;
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String getLogin()
	{
		return "login";
	}
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute User u,Model model)
	{
		u.setPassword(DigestUtils.md5DigestAsHex(u.getPassword().getBytes()));
		User un=udao.Login(u.getUsername(), u.getPassword());
		if(un!=null)
		{
			model.addAttribute("msg","Login Successful!");
			model.addAttribute("slist",sdao.getAllStudent());
		return "home";
		}
		model.addAttribute("msg","Invalid username or password!");
		return "login";
	}

}

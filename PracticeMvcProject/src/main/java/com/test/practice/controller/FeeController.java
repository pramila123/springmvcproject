package com.test.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.practice.db.FeeDao;
import com.test.practice.db.StudentDao;
import com.test.practice.model.Fee;
import com.test.practice.model.Student;

@Controller
public class FeeController {
	@Autowired
	private StudentDao sdao;
	@Autowired
	private FeeDao fdao;
	@RequestMapping(value = "/fee",method = RequestMethod.GET)
	public String getFee(Model model)
	{
		model.addAttribute("fmodel",new Fee());
		return "fee";
	}
	@RequestMapping(value = "/fee",method = RequestMethod.POST)
	public String addFee(@ModelAttribute Fee f)
	{
		fdao.addFee(f);
		return "redirect:/fee";
	}
	
	@RequestMapping(value = "/getAllFee")
	public String getAllFee(Model model)
	{
		model.addAttribute("slist",fdao.getAllFee());
		return "viewfee";
	}
	
	
}

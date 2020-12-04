package com.test.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.practice.db.StudentDao;
import com.test.practice.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDao sdao;
	@RequestMapping(value = "/student" ,method = RequestMethod.GET)
	public String getStd(Model model)
	{
		model.addAttribute("smodel",new Student());
		return "student";
	}
	@RequestMapping(value = "/student",method = RequestMethod.POST)
	public String addStd(@ModelAttribute Student s)
	{
		sdao.addStudent(s);
		return "redirect:getAllStudents";
	}
	@RequestMapping(value = "/getAllStudents")
	public String getAllStudent(Model model)
	{
		model.addAttribute("slist",sdao.getAllStudent());
		return "home";
	}
	
	@RequestMapping(value = "/edit/{sid}")
	public String editStudent(@PathVariable("sid")long id,Model model)
	{
		model.addAttribute("smodel",sdao.getById(id));
		return "editStd";
	}
@RequestMapping(value = "/update/student",method = RequestMethod.POST)
	public String updateStd(Model model,@ModelAttribute Student s)
	{
	    sdao.updateStd(s);
	    model.addAttribute("msg","Update Successful!");
	    model.addAttribute("slist",sdao.getAllStudent());
		return "home";
	}
@RequestMapping(value = "/delete/{sid}")
public String deleteStd(@PathVariable("sid")long id,Model model)
{
	sdao.deleteStd(id);
	model.addAttribute("msg","Delete data Successfully!");
	model.addAttribute("slist",sdao.getAllStudent());
	return "home";
}
}

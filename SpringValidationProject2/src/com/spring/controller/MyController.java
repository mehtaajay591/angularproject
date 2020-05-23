package com.spring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.MyDAO;
import com.spring.bean.Customer;
import com.spring.service.CustomerService;
import com.spring.service.ICustomerService;


@Controller
public class MyController
{

	@Autowired
	ICustomerService service;


	@RequestMapping("/")
	public String showIndexPage()
	{
		String view="Index";
		return view;
	}


	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView getRegisterPage()
	{
		ModelAndView mv=new ModelAndView("CustomerRegistration");
		mv.addObject("customer",new Customer());
		return mv;
	}
//
//	@RequestMapping(value="/registerAction",method=RequestMethod.POST)
//	public String getregisterCustomer(@ModelAttribute Customer customer,BindingResult result,Model model )
//	{
//			
//			model.addAttribute(customer);
//			return "Success";
//		}
//
//	}

	@RequestMapping(method=RequestMethod.POST,value="/registerAction")
	public String registerCustomer(@ModelAttribute Customer customer,Model model )
	{
		customer=service.addCustomer(customer);
		model.addAttribute("customer",customer);
		return "Success";

	}
	@RequestMapping(method=RequestMethod.GET,value="/showDetails")
	public String ShowCustomer(@ModelAttribute Customer customer,Model model )
	{
		List<Customer> list=service.getAllCustomer();
		model.addAttribute("custlist",list);
		return "ShowAllDetails";

	}



}

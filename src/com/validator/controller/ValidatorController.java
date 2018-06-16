package com.validator.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.validator.model.User;


@RequestMapping("/validator")
public class ValidatorController extends MultiActionController{
	
	@RequestMapping(method = RequestMethod.GET, value = "setUser")
	public ModelAndView setUser(HttpServletRequest request, HttpServletResponse response,ModelMap model) {
		User user = new User();
//		model.addAttribute("user", user);
		return new ModelAndView("welcome/add").addObject(user);
	}

	@RequestMapping(method = RequestMethod.POST, value = "show")
	public ModelAndView show(@Valid User user,BindingResult result) throws Exception {
		if(result.hasErrors()){
			return new ModelAndView("welcome/add").addObject(user);
		}
//		String name = request.getParameter("name");
//		System.out.println("show  方法被呼叫: name="+name);
//		return new ModelAndView("welcome/back-view", "greetingKey", name); //Internal Resource View (內部資源視圖)
		return null;
	}
	
}

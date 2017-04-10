//package com.cmpe220.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.cmpe220.service.UserService;
//
//@RestController
//@RequestMapping("/signOut")
//public class SignoutController {
//	@Autowired
//	private UserService userService;
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public String signOut(){
//		ModelAndView obj = new ModelAndView("signOut");
//		//obj.addObject("user", userService.getCurrentUser());
//		return "{'user'; userData.toString()}";
//		//return obj;
//	}
//}

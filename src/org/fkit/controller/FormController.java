package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 动态页面跳转控制器
 * */
@Controller
public class FormController{

	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){

		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		System.out.println("11111111111111");
		// 动态跳转页面
		return formName;
	}

}


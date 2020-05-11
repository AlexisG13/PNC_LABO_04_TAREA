package com.uca.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea4.domain.Producto;
import com.uca.tarea4.domain.Robot;

@Controller()
public class MainController {

	@RequestMapping("producto")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("formProducto")
	public ModelAndView formProducto(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("robot",new Robot());
			mav.setViewName("robot");
		}
		return mav;
	}
	
	@RequestMapping("seguridad")
	public ModelAndView formSeguridad(@Valid @ModelAttribute Robot robot, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("robot");
		}
		else {
			mav.setViewName("exito");
		}
		return mav;
	}

}
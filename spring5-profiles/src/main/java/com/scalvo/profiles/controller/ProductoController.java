package com.scalvo.profiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.scalvo.profiles.repository.ProductoRepository;

@Controller
public class ProductoController {
	@Autowired
	private ProductoRepository repo;
	
	@RequestMapping(value="/productos", method = RequestMethod.GET)
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView("listado_productos");
		mav.addObject("productos", repo.findAll());
		return mav;
	}
	
	@RequestMapping(value="/productos/{id}", method = RequestMethod.GET)
	public ModelAndView detalle(@PathVariable Long id) {
		ModelAndView mav = new ModelAndView("detalle_producto");
		mav.addObject("producto", repo.findById(id).get());
		return mav;
	}
}

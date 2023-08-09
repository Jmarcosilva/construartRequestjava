package com.lojaconstrucao.construart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sistema")
public class ConstruartController {

	@GetMapping
	public String listarMenu() {
		return"sistema/menu";
	}
	
}

package com.lojaconstrucao.construart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lojaconstrucao.construart.model.DadosCadastroCliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping
	public String abreFormularioCliente() {
		return"forms/cliente";
	}
	
	@PostMapping
	public String cadastraCliente(DadosCadastroCliente dados) {
		System.out.println(dados);
		
		return"forms/cliente";
	}

}

package com.lojaconstrucao.construart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lojaconstrucao.construart.model.DadosCadastroProduto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
	
	@GetMapping
	public String abreFormularioProduto() {
		return"forms/produto";
	}
	
	@PostMapping
	public String cadastroProduto(DadosCadastroProduto dados) {
		System.out.println(dados);
		
		return"forms/produto";
		
	}

}

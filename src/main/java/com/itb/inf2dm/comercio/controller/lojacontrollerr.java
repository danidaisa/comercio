package com.itb.inf2dm.comercio.controller;

import array.

public class lojacontrollerr {

	
	
	import org.springframework.stereotype.controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import com.itb.inf2dm.comercio.model.Produto;
	
	
	@Controller
	@RequestMapping("/comercio/produto")
	
	public class LojaController{
		
		List<Produto> listaDeProdutos = new ArraysProduto();
		
		@GetMapping("/listar")
		
		public String listarProdutos(Model model) {
			
			Produto p1 = new Produto();
			p1.setId(201);
			p1.setNome("Maquin de Lavar Brastemp 12 litros");
			p1.setCodigoBarras("HGHG89");
			
		}
			
		}
}

package com.itb.inf2dm.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.util.Model;
import org.springframewoek.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2dm.comercio.model.produto;
@Controller
@RequestMapping("/comercio/produtos")
public class lojaController {

	List<produto> listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public string listarProdutos(Model model) {
		Produto p1 = new Produto();
		p1.setId(20l);
		p1.setNome("Máquina de Lavar Brastemp 12 litros");
		p1.setCodigoBarras("JHJHJHHJHJHH1234");
		p1.setPreco(1234.23);
		p1.setDescricao(null);
		p1.setCodStatus(true);
		
		
		Produto p2 = new Produto ();
		p2.setId(20l);
		p2.setNome("Micro-ondas");
		p2.setCodigoBarras("pppJHJHH1234");
		p2.setPreco(3242.23);
		p1.setDescricao(null);
		p2.setCodStatus(false);
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		model.addAtribute("listadeProdutos", listaDeProdutos);
		return "produto";
	}
	
	@GetMapping("/novo-prod")
	public String novoProduto() {
		return "novo-prod";
	}

}

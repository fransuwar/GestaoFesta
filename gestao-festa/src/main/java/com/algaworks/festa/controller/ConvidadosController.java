package com.algaworks.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.festa.model.Convidado;
import com.algaworks.festa.repositoy.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	private Convidados convidados;
	
	@RequestMapping
	public ModelAndView listar(){
		ModelAndView modelAndView = new ModelAndView("listaConvidados");
		modelAndView.addObject("convidados", convidados.todos());
		modelAndView.addObject("novoConvidado", new Convidado());
		return modelAndView;
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Convidado convidado) {
		convidados.adiciona(convidado);
		return "redirect:/convidados";
	}
	
	@RequestMapping("/deletar{id}")
	public String deletar(@RequestParam("id") Long id) {
		convidados.remover(id);
		return "redirect:/convidados";
	}
}

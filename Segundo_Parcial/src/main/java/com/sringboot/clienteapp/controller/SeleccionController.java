package com.sringboot.clienteapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sringboot.clienteapp.entity.Seleccion;
import com.sringboot.clienteapp.service.SeleccionServiceImp;

@Controller
@RequestMapping("/views/cliente/")
public class SeleccionController {
	
	@Autowired
	private SeleccionServiceImp clienteservice;
	
	@GetMapping("/")
	public String listar(Model model) {

		List<Seleccion> listadocliente = clienteservice.listar();

		model.addAttribute("titulo", "lista de clientes");
		model.addAttribute("cliente", listadocliente);

		return "views/cliente/listar";
	}	
	
	
	
	

}

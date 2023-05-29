package com.sringboot.clienteapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sringboot.clienteapp.entity.Seleccion;
import com.sringboot.clienteapp.repository.SeleccionRepository;



public class SeleccionServiceImp implements Iseleccion {
	@Autowired
	private SeleccionRepository seleccionrepository; 
	
	@Override
	public List<Seleccion> listar() {
		 
		return (List<Seleccion>)seleccionrepository.findAll();
	}

	@Override
	public Seleccion guardar(Seleccion cliente) {
		
		return seleccionrepository.save(cliente);
	}

	@Override
	public Seleccion buscarid(int id) {
		
		return (Seleccion) seleccionrepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(int id) {
		seleccionrepository.deleteById(id);
	}

	@Override
	public void editar(int id) {
		seleccionrepository.findById(id).orElse(null);

	}


}

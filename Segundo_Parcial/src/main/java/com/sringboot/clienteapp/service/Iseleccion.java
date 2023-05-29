package com.sringboot.clienteapp.service;

import java.util.List;

import com.sringboot.clienteapp.entity.Seleccion;

public interface Iseleccion{
	
	public List<Seleccion> listar();
	public Seleccion guardar(Seleccion cliente);
	public Seleccion buscarid(int id);
	public void eliminar(int id);
	public void editar(int id);

}
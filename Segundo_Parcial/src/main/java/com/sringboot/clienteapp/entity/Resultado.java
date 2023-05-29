package com.sringboot.clienteapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Resultado {

	
	@Id
	@SequenceGenerator(name="continente_id_seq",allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "continente_id_seq")
private int id;
private Partido partidoid;
private Seleccion seleccionid;
private int goles;
private int amarillas;
private int rojas;
	

}

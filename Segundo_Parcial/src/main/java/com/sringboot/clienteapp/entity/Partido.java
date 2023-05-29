package com.sringboot.clienteapp.entity;

import java.sql.Date;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Partido {
	
private int id;
private Date fecha;

@ManyToOne
@JoinColumn(name="id")
private Estadio estadioid;
	

}

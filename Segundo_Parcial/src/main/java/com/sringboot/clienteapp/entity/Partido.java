package com.sringboot.clienteapp.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="partido")
public class Partido {

	@Id
	@SequenceGenerator(name="continente_id_seq",allocationSize = 1)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "continente_id_seq")
private int id;
private Date fecha;

@ManyToOne
@JoinColumn(name="id")
private Estadio estadioid;
	

}

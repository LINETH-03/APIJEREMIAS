package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Puesto")
public class Puesto {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PuestoNumero")
    public int PuestoNumero;
	@Column(name ="PuestoDescripcion")
    public String  PuestoDescripcion;
	
	
	
	
	
	
	public Puesto() {
		 
	}
	public Puesto(int puestoNumero, String puestoDescripcion) {
		super();
		PuestoNumero = puestoNumero;
		PuestoDescripcion = puestoDescripcion;
	}
	public int getPuestoNumero() {
		return PuestoNumero;
	}
	public void setPuestoNumero(int puestoNumero) {
		PuestoNumero = puestoNumero;
	}
	public String getPuestoDescripcion() {
		return PuestoDescripcion;
	}
	public void setPuestoDescripcion(String puestoDescripcion) {
		PuestoDescripcion = puestoDescripcion;
	}
	
	

}

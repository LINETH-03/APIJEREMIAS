package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Departamento")
public class Departamento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DepartamentoCodigo")
    public int DepartamentoCodigo;
	@Column(name ="Descripcion")
    public String   Descripcion;
	
	
	
	
	
	public Departamento() {
		 
	}
	public Departamento(int departamentoCodigo, String descripcion) {
		super();
		DepartamentoCodigo = departamentoCodigo;
		Descripcion = descripcion;
	}
	public int getDepartamentoCodigo() {
		return DepartamentoCodigo;
	}
	public void setDepartamentoCodigo(int departamentoCodigo) {
		DepartamentoCodigo = departamentoCodigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	

}

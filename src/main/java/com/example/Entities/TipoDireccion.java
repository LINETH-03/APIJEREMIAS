package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "TipoDireccion")
public class TipoDireccion {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TipoDireccion")
    public int TipoDirecion;
	@Column(name = "Descripcion")
    public String  Descripcion;
	public TipoDireccion() {
		 
	}
	public TipoDireccion(int tipoDirecion, String descripcion) {
		super();
		TipoDirecion = tipoDirecion;
		Descripcion = descripcion;
	}
	public int getTipoDirecion() {
		return TipoDirecion;
	}
	public void setTipoDirecion(int tipoDirecion) {
		TipoDirecion = tipoDirecion;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	
	

}

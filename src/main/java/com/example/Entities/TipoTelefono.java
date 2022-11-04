package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "TipoTelefono")
public class TipoTelefono {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TipoTelefono")
    public int TipoTelefono;
	@Column(name = " Descripcion")
    public String  Descripcion;
	
	
	
	
	public TipoTelefono() {
		 
		// TODO Auto-generated constructor stub
	}
	public TipoTelefono(int tipoTelefono, String descripcion) {
		super();
		TipoTelefono = tipoTelefono;
		Descripcion = descripcion;
	}
	public int getTipoTelefono() {
		return TipoTelefono;
	}
	public void setTipoTelefono(int tipoTelefono) {
		TipoTelefono = tipoTelefono;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	
	

}

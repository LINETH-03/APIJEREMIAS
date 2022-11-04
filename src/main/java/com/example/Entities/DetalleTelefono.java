package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "DetalleTelefono")
public class DetalleTelefono {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DetalleTelefonoCorrelativo")
    public int DetalleTelefonoCorrelativo;
	@Column(name ="PersonaCodigo")
    public int  PersonaCodigo;
	@Column(name ="TipoTelefono")
    public int  TipoTelefono;
	@Column(name ="Numero")
    public String  Numero;
	@Column(name ="RestauranteNumero")
    public int  RestauranteNumero;
	
	
	public DetalleTelefono() {
		 
	}


	public DetalleTelefono(int detalleTelefonoCorrelativo, int personaCodigo, int tipoTelefono, String numero,
			int restauranteNumero) {
		super();
		DetalleTelefonoCorrelativo = detalleTelefonoCorrelativo;
		PersonaCodigo = personaCodigo;
		TipoTelefono = tipoTelefono;
		Numero = numero;
		RestauranteNumero = restauranteNumero;
	}


	public int getDetalleTelefonoCorrelativo() {
		return DetalleTelefonoCorrelativo;
	}


	public void setDetalleTelefonoCorrelativo(int detalleTelefonoCorrelativo) {
		DetalleTelefonoCorrelativo = detalleTelefonoCorrelativo;
	}


	public int getPersonaCodigo() {
		return PersonaCodigo;
	}


	public void setPersonaCodigo(int personaCodigo) {
		PersonaCodigo = personaCodigo;
	}


	public int getTipoTelefono() {
		return TipoTelefono;
	}


	public void setTipoTelefono(int tipoTelefono) {
		TipoTelefono = tipoTelefono;
	}


	public String getNumero() {
		return Numero;
	}


	public void setNumero(String numero) {
		Numero = numero;
	}


	public int getRestauranteNumero() {
		return RestauranteNumero;
	}


	public void setRestauranteNumero(int restauranteNumero) {
		RestauranteNumero = restauranteNumero;
	}
	
	
	
	
}

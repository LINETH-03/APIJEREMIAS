package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Restaurante")
public class Restaurante {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RestauranteNumero")
    public int RestauranteNumero;
	@Column(name = "Nombrerestaurante")
    public String NombreRestaurante;
	
	
	
	public Restaurante() {
		 
	}
	public Restaurante(int restauranteNumero, String nombreRestaurante) {
		super();
		RestauranteNumero = restauranteNumero;
		NombreRestaurante = nombreRestaurante;
	}
	public int getRestauranteNumero() {
		return RestauranteNumero;
	}
	public void setRestauranteNumero(int restauranteNumero) {
		RestauranteNumero = restauranteNumero;
	}
	public String getNombreRestaurante() {
		return NombreRestaurante;
	}
	public void setNombreRestaurante(String nombreRestaurante) {
		NombreRestaurante = nombreRestaurante;
	}
	
	
	

}

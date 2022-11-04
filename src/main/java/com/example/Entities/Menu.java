package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Menu")
public class Menu {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MenuNumero")
    public int MenuNumero;
	@Column(name ="MenuDescripcion")
    public String  MenuDescripcion;
	public Menu() {
		 
	}
	public Menu(int menuNumero, String menuDescripcion) {
		super();
		MenuNumero = menuNumero;
		MenuDescripcion = menuDescripcion;
	}
	public int getMenuNumero() {
		return MenuNumero;
	}
	public void setMenuNumero(int menuNumero) {
		MenuNumero = menuNumero;
	}
	public String getMenuDescripcion() {
		return MenuDescripcion;
	}
	public void setMenuDescripcion(String menuDescripcion) {
		MenuDescripcion = menuDescripcion;
	}
	
	
	
	
}

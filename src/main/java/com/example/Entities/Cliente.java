package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Cliente")
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ClienteCodigo")
    public int ClienteCodigo;
	@Column(name ="PersonaCodigo")
    public int  PersonaCodigo;
	
	
	
	public Cliente() {
		 
	}



	public Cliente(int clienteCodigo, int personaCodigo) {
		super();
		ClienteCodigo = clienteCodigo;
		PersonaCodigo = personaCodigo;
	}



	public int getClienteCodigo() {
		return ClienteCodigo;
	}



	public void setClienteCodigo(int clienteCodigo) {
		ClienteCodigo = clienteCodigo;
	}



	public int getPersonaCodigo() {
		return PersonaCodigo;
	}



	public void setPersonaCodigo(int personaCodigo) {
		PersonaCodigo = personaCodigo;
	}
	
	
	
	

}

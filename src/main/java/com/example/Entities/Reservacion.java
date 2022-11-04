package com.example.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Reservacion")
public class Reservacion {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ReservacionNumero")
    public int ReservacionNumero;
	
	@Column(name ="FechaReservacion")
    public Date  FechaReservacion;
	
	@Column(name ="ClienteCodigo")
    public int  ClienteCodigo;
	
	@Column(name ="RestauranteNumero")
    public int RestauranteNumero;
	@Column(name ="EmpleadoCodigo")
    public int  EmpleadoCodigo;
	
	
	public Reservacion() {
		 
	}


	public Reservacion(int reservacionNumero, Date fechaReservacion, int clienteCodigo, int restauranteNumero,
			int empleadoCodigo) {
		super();
		ReservacionNumero = reservacionNumero;
		FechaReservacion = fechaReservacion;
		ClienteCodigo = clienteCodigo;
		RestauranteNumero = restauranteNumero;
		EmpleadoCodigo = empleadoCodigo;
	}


	public int getReservacionNumero() {
		return ReservacionNumero;
	}


	public void setReservacionNumero(int reservacionNumero) {
		ReservacionNumero = reservacionNumero;
	}


	public Date getFechaReservacion() {
		return FechaReservacion;
	}


	public void setFechaReservacion(Date fechaReservacion) {
		FechaReservacion = fechaReservacion;
	}


	public int getClienteCodigo() {
		return ClienteCodigo;
	}


	public void setClienteCodigo(int clienteCodigo) {
		ClienteCodigo = clienteCodigo;
	}


	public int getRestauranteNumero() {
		return RestauranteNumero;
	}


	public void setRestauranteNumero(int restauranteNumero) {
		RestauranteNumero = restauranteNumero;
	}


	public int getEmpleadoCodigo() {
		return EmpleadoCodigo;
	}


	public void setEmpleadoCodigo(int empleadoCodigo) {
		EmpleadoCodigo = empleadoCodigo;
	}
	
	
	
}

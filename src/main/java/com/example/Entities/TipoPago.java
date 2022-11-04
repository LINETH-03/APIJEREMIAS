package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "TipoPago")
public class TipoPago {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TipoPagoNumero")
    public int TipoPagoNumero;
	@Column(name = "TipoPagoDescripcion")
    public String TipopagoDescripcion;
	@Column(name = "RequiereDescripcion")
    public Boolean RequiereDescripcion;
	
	
	
	
	
	public TipoPago(int tipoPagoNumero, String tipopagoDescripcion, Boolean requiereDescripcion) {
		super();
		TipoPagoNumero = tipoPagoNumero;
		TipopagoDescripcion = tipopagoDescripcion;
		RequiereDescripcion = requiereDescripcion;
	}

	public TipoPago() {
		 
	}
	
	public int getTipoPagoNumero() {
		return TipoPagoNumero;
	}
	public void setTipoPagoNumero(int tipoPagoNumero) {
		TipoPagoNumero = tipoPagoNumero;
	}
	public String getTipopagoDescripcion() {
		return TipopagoDescripcion;
	}
	public void setTipopagoDescripcion(String tipopagoDescripcion) {
		TipopagoDescripcion = tipopagoDescripcion;
	}
	public Boolean getRequiereDescripcion() {
		return RequiereDescripcion;
	}
	public void setRequiereDescripcion(Boolean requiereDescripcion) {
		RequiereDescripcion = requiereDescripcion;
	}
    
    
    
    
	
    
	
    
   
	

}

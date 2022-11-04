package com.example.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Producto")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductoNumero")
    public int ProductoNumero;
	@Column(name = "ProductoDescripcion")
    public String ProductoDescripcion;
	
	
	
	
	
	public Producto() {
		 
	 
	}
	public Producto(int productoNumero, String productoDescripcion) {
		super();
		ProductoNumero = productoNumero;
		ProductoDescripcion = productoDescripcion;
	}
	public int getProductoNumero() {
		return ProductoNumero;
	}
	public void setProductoNumero(int productoNumero) {
		ProductoNumero = productoNumero;
	}
	public String getProductoDescripcion() {
		return ProductoDescripcion;
	}
	public void setProductoDescripcion(String productoDescripcion) {
		ProductoDescripcion = productoDescripcion;
	}
	
	
	

}

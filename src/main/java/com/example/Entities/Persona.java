package com.example.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Persona")
public class Persona {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PersonaCodigo")
    public int PersonaCodigo;
	@Column(name ="PrimerNombre")
    public String  PrimerNombre;
	@Column(name ="SegundoNombre")
    public String  SegundoNombre;
	@Column(name ="PrimerApellido")
    public String  PrimerApellido;
	@Column(name ="SegundoApellido")
    public String  SegundoApellido;
	@Column(name ="FechaNacimiento")
    public Date  FechaNacimiento;
	@Column(name ="CUI")
    public String  CUI;
	@Column(name ="NIT")
    public String  NIT;
	@Column(name ="RazonSocial")
    public String  RazonSocial;
	@Column(name ="TipoCliente")
    public char  TipoCliente;
	@Column(name ="Genero")
    public char  Genero;
	public Persona() {
		 
		// TODO Auto-generated constructor stub
	}
	public Persona(int personaCodigo, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, Date fechaNacimiento, String cUI, String nIT, String razonSocial, char tipoCliente,
			char genero) {
		super();
		PersonaCodigo = personaCodigo;
		PrimerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		FechaNacimiento = fechaNacimiento;
		CUI = cUI;
		NIT = nIT;
		RazonSocial = razonSocial;
		TipoCliente = tipoCliente;
		Genero = genero;
	}
	public int getPersonaCodigo() {
		return PersonaCodigo;
	}
	public void setPersonaCodigo(int personaCodigo) {
		PersonaCodigo = personaCodigo;
	}
	public String getPrimerNombre() {
		return PrimerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return SegundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return PrimerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getCUI() {
		return CUI;
	}
	public void setCUI(String cUI) {
		CUI = cUI;
	}
	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nIT) {
		NIT = nIT;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public char getTipoCliente() {
		return TipoCliente;
	}
	public void setTipoCliente(char tipoCliente) {
		TipoCliente = tipoCliente;
	}
	public char getGenero() {
		return Genero;
	}
	public void setGenero(char genero) {
		Genero = genero;
	}
	
	
	
	
	
	
	
	

}

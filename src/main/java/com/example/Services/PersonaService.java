package com.example.Services;

import com.example.Entities.Persona;

public interface PersonaService {
	public Persona findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Persona gen);
	public void create(Persona gen);

}

package com.example.Services;

import com.example.Entities.Restaurante;

public interface RestautanteService {
	
	public Restaurante findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Restaurante restaurante);
	public void create(Restaurante restaurante);

}

package com.example.Services;

import com.example.Entities.TipoDireccion;

public interface TipoDireccionService {
	public TipoDireccion findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,TipoDireccion gen);
	public void create(TipoDireccion gen);


}

package com.example.Services;

import com.example.Entities.Puesto;

public interface PuestoService {
	public Puesto findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Puesto gen);
	public void create(Puesto gen);

}

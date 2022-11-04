package com.example.Services;

import com.example.Entities.Departamento;

public interface DepartamentoService {
	public Departamento findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Departamento gen);
	public void create(Departamento gen);

}

package com.example.Services;

import com.example.Entities.Cliente;

public interface ClienteService {
	public Cliente findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Cliente gen);
	public void create(Cliente gen);

}

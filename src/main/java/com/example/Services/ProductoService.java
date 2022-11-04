package com.example.Services;

import com.example.Entities.Producto;

public interface ProductoService {
	public Producto findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Producto producto);
	public void create(Producto producto);

}

package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ProductoDao;
import com.example.Entities.Producto;
@Service
public class ProductoImpl implements ProductoService {
	
	@Autowired
	ProductoDao producDao;

	@Override
	public Producto findById(int Id) {
		// TODO Auto-generated method stub
		return producDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		producDao.delete(Id);
		
	}

	@Override
	public void modify(int Id, Producto producto) {
		// TODO Auto-generated method stub
		if(producDao.existsById(Id)) {
			producto.setProductoNumero(Id);;
			producDao.save(producto);
			
		}
	}

	@Override
	public void create(Producto producto) {
		// TODO Auto-generated method stub
		producDao.save(producto);
	}

}

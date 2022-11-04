package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.PuestoDao;
import com.example.Entities.Puesto;

@Service
public class PuestoImpl implements PuestoService{
	@Autowired
	PuestoDao puestoDao;



	@Override
	public Puesto findById(int Id) {
		// TODO Auto-generated method stub
		return puestoDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		puestoDao.delete(Id);
	}

	@Override
	public void modify(int Id, Puesto gen) {
		// TODO Auto-generated method stub
		if(puestoDao.existsById(Id)) {
			gen.setPuestoNumero(Id);;
			puestoDao.save(gen);}
		
	}

	@Override
	public void create(Puesto gen) {
		// TODO Auto-generated method stub
		puestoDao.save(gen);
	}

}

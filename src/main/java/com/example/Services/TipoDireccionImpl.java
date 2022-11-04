package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.TipoDireccionDao;
import com.example.Entities.TipoDireccion;
@Service
public class TipoDireccionImpl implements TipoDireccionService{
	@Autowired
	TipoDireccionDao direDao;

	@Override
	public TipoDireccion findById(int Id) {
		// TODO Auto-generated method stub
		return direDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		direDao.delete(Id);
	}

	@Override
	public void modify(int Id, TipoDireccion gen) {
		// TODO Auto-generated method stub
		if(direDao.existsById(Id)) {
			gen.setTipoDirecion(Id);
			direDao.save(gen);}
	}

	@Override
	public void create(TipoDireccion gen) {
		// TODO Auto-generated method stub
		direDao.save(gen);
	}

}

package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.TipoTelefonoDao;
import com.example.Entities.TipoTelefono;

@Service

public class TipoTelefonoImplements implements TipoTelefonoservice{
	@Autowired
	TipoTelefonoDao tipotelDao;

	@Override
	public TipoTelefono findById(int Id) {
		// TODO Auto-generated method stub
		return tipotelDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		tipotelDao.delete(Id);
	}

	@Override
	public void modify(int Id, TipoTelefono Tipotelefono) {
		// TODO Auto-generated method stub
		if(tipotelDao.existsById(Id)) {
			Tipotelefono.setTipoTelefono(Id);
			tipotelDao.save(Tipotelefono);
			
		}
	}

	@Override
	public void create(TipoTelefono Tipotelefono) {
		// TODO Auto-generated method stub
		tipotelDao.save(Tipotelefono);
		
		
	}



}

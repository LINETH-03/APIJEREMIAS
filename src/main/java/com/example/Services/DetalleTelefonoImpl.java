package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.DetalleTelefonoDao;
import com.example.Entities.DetalleTelefono;
@Service
public class DetalleTelefonoImpl implements DetalleTelefonoService {
	@Autowired
	DetalleTelefonoDao telDao;

	@Override
	public DetalleTelefono findById(int Id) {
		// TODO Auto-generated method stub
		return telDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		telDao.delete(Id);
	}

	@Override
	public void modify(int Id, DetalleTelefono gen) {
		// TODO Auto-generated method stub
		if(telDao.existsById(Id)) {
			gen.setDetalleTelefonoCorrelativo(Id);
			telDao.save(gen);
		}
	}

	@Override
	public void create(DetalleTelefono gen) {
		// TODO Auto-generated method stub
		telDao.save(gen);
	}

}

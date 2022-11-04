package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.RestauranteDao;
import com.example.Entities.Restaurante;
@Service

public class RestauranteImpl implements RestautanteService {
	@Autowired
	RestauranteDao resDao;

	@Override
	public Restaurante findById(int Id) {
		// TODO Auto-generated method stub
		return resDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		resDao.delete(Id);
	}

	@Override
	public void modify(int Id, Restaurante restaurante) {
		// TODO Auto-generated method stub
		if(resDao.existsById(Id)) {
			restaurante.setRestauranteNumero(Id);;
			resDao.save(restaurante);
			
		}
		
	}

	@Override
	public void create(Restaurante restaurante) {
		// TODO Auto-generated method stub
		resDao.save(restaurante);
	}

}

package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ReservacionDao;
import com.example.Entities.Reservacion;
@Service
public class ReservacionImpl implements ReservacionService {

	@Autowired
	ReservacionDao redao;

	@Override
	public Reservacion findById(int Id) {
		// TODO Auto-generated method stub
		return redao.findbyId(Id);
		
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		redao.delete(Id);
	}

	@Override
	public void modify(int Id, Reservacion gen) {
		// TODO Auto-generated method stub
		if(redao.existsById(Id)) {
			gen.setReservacionNumero(Id);
			redao.save(gen);
		}
		
	}

	@Override
	public void create(Reservacion gen) {
		// TODO Auto-generated method stub
		redao.save(gen);
	}
	

}

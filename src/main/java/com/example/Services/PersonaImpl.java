package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.PersonaDao;
import com.example.Entities.Persona;
@Service
public class PersonaImpl implements PersonaService {
	@Autowired
	PersonaDao perdao;
	@Override
	public Persona findById(int Id) {
		// TODO Auto-generated method stub
		return perdao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		perdao.delete(Id);
	}

	@Override
	public void modify(int Id, Persona gen) {
		// TODO Auto-generated method stub
		if(perdao.existsById(Id)) {
			gen.setPersonaCodigo(Id);
			perdao.save(gen);}
	}

	@Override
	public void create(Persona gen) {
		// TODO Auto-generated method stub
		perdao.save(gen);
	}
	

}

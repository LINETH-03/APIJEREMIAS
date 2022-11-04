package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.DepartamentoDao;
import com.example.Entities.Departamento;
@Service
public class DepartamentoImpl implements DepartamentoService{
	@Autowired
	DepartamentoDao depDao;
	@Override
	public Departamento findById(int Id) {
		// TODO Auto-generated method stub
		return depDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		depDao.delete(Id);
	}

	@Override
	public void modify(int Id, Departamento gen) {
		// TODO Auto-generated method stub
		if(depDao.existsById(Id)) {
			gen.setDepartamentoCodigo(Id);;
			depDao.save(gen);}
	}

	@Override
	public void create(Departamento gen) {
		// TODO Auto-generated method stub
		depDao.save(gen);
	}

}

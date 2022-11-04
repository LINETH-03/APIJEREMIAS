package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.ClienteDao;
import com.example.Entities.Cliente;
@Service
public class ClienteImpl implements ClienteService {
	@Autowired
	ClienteDao cliDao;
	@Override
	public Cliente findById(int Id) {
		// TODO Auto-generated method stub
		return cliDao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		cliDao.delete(Id);
		
	}

	@Override
	public void modify(int Id, Cliente gen) {
		// TODO Auto-generated method stub
		if(cliDao.existsById(Id)) {
			gen.setClienteCodigo(Id);
			cliDao.save(gen);}
	}

	@Override
	public void create(Cliente gen) {
		// TODO Auto-generated method stub
		cliDao.save(gen);
	}

}

package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.MenuDao;
import com.example.Entities.Menu;
@Service
public class MenuImpl implements MenuService {
	@Autowired
	MenuDao Mdao;

	@Override
	public Menu findById(int Id) {
		// TODO Auto-generated method stub
		return Mdao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		Mdao.delete(Id);
	}

	@Override
	public void modify(int Id, Menu gen) {
		// TODO Auto-generated method stub
		if(Mdao.existsById(Id)) {
			gen.setMenuNumero(Id);
			Mdao.save(gen);}
	}

	@Override
	public void create(Menu gen) {
		// TODO Auto-generated method stub
		Mdao.save(gen);
	}

}

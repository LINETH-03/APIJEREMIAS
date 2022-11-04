package com.example.Services;

import com.example.Entities.Menu;

public interface MenuService {
	public Menu findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Menu gen);
	public void create(Menu gen);

}

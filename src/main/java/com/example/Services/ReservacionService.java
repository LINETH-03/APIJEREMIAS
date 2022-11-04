package com.example.Services;

import com.example.Entities.Reservacion;

public interface ReservacionService {
	public Reservacion findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,Reservacion gen);
	public void create(Reservacion gen);


}

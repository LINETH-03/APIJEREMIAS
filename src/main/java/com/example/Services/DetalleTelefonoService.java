package com.example.Services;

import com.example.Entities.DetalleTelefono;

public interface DetalleTelefonoService {
	 
		public DetalleTelefono findById (int Id);
		public void deleteByIdC(int Id);
		public void modify(int Id,DetalleTelefono gen);
		public void create(DetalleTelefono gen);

}

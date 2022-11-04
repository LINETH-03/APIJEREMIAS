package com.example.Services;

import com.example.Entities.TipoTelefono;

public interface TipoTelefonoservice {
	public TipoTelefono findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,TipoTelefono Tipotelefono);
	public void create(TipoTelefono Tipotelefono);

}

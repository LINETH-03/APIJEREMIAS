package com.example.Services;



import com.example.Entities.TipoPago;
 

public interface TipoPagoService {
	public TipoPago findById (int Id);
	public void deleteByIdC(int Id);
	public void modify(int Id,TipoPago Tipopago);
	public void create(TipoPago Tipopago);


}

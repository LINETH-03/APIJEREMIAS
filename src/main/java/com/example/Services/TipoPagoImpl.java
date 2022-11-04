package com.example.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.TipoPagoDao;
import com.example.Entities.TipoPago;
@Service
public class TipoPagoImpl implements TipoPagoService {
	@Autowired
	TipoPagoDao TipoPAGOdao;

	@Override
	public TipoPago findById(int Id) {
		// TODO Auto-generated method stub
		return TipoPAGOdao.findbyId(Id);
	}

	@Override
	public void deleteByIdC(int Id) {
		// TODO Auto-generated method stub
		  TipoPAGOdao.delete(Id);
	}

	@Override
	public void modify(int Id, TipoPago Tipopago) {
		// TODO Auto-generated method stub
		if(TipoPAGOdao.existsById(Id)) {
			Tipopago.setTipoPagoNumero(Id);;
			TipoPAGOdao.save(Tipopago);}
	}

	@Override
	public void create(TipoPago Tipopago) {
		// TODO Auto-generated method stub
		TipoPAGOdao.save(Tipopago);
		
	}
	
	 

	 
 

	 
	

}

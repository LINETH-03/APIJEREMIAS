package com.example.DAO;

 
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
import org.springframework.stereotype.Repository;

import com.example.Entities.TipoPago;
@Repository
public interface TipoPagoDao extends CrudRepository <TipoPago, Integer>{
	
	
	@Query(value = "execute SE_TipoPagoSeleccionar ?", nativeQuery = true) TipoPago findbyId(int id);
	@Query(value = "execute EL_TipoPagoEliminar ?", nativeQuery = true)TipoPago delete(int id);
	@Query(value = "execute AC_TipoPagoActualizar ?", nativeQuery = true)TipoPago update(int id);
	@Query(value = "execute IN_TipoPagoInsertar ?, ?, ?", nativeQuery = true)TipoPago create(int id);
	
	


}

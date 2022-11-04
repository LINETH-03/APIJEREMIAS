package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
import com.example.Entities.Reservacion;

 

public interface ReservacionDao extends CrudRepository <Reservacion, Integer> {
	
	@Query(value = "execute SE_ReservacionSeleccionar ?", nativeQuery = true) Reservacion findbyId(int id);
	@Query(value = "execute EL_ReservacionEliminar ?", nativeQuery = true)Reservacion delete(int id);
	@Query(value = "execute AC_ReservacionActualizar ?", nativeQuery = true)Reservacion update(int id);
	@Query(value = "execute IN_ReservacionInsertar ?, ?, ?, ?, ?", nativeQuery = true)Reservacion create(int id);

}

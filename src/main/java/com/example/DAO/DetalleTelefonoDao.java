package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Entities.DetalleTelefono;

 

public interface DetalleTelefonoDao extends CrudRepository <DetalleTelefono, Integer> {
	
	@Query(value = "execute SE_DetalleTelefonoSeleccionar ?", nativeQuery = true) DetalleTelefono findbyId(int id);
	@Query(value = "execute EL_DetalleTelefonoEliminar ?", nativeQuery = true)DetalleTelefono delete(int id);
	@Query(value = "execute AC_DetalleTelefonoActualizar ?", nativeQuery = true)DetalleTelefono update(int id);
	@Query(value = "execute IN_DetalleTelefonoInsertar ?, ?, ?, ?, ?", nativeQuery = true)DetalleTelefono create(int id);

}

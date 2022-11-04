package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Puesto;
 

 

@Repository

public interface PuestoDao extends CrudRepository <Puesto, Integer>{
	
	@Query(value = "execute SE_PuestoSeleccionar ?", nativeQuery = true) Puesto findbyId(int id);
	@Query(value = "execute EL_PuestoEliminar ?", nativeQuery = true)Puesto delete(int id);
	@Query(value = "execute AC_PuestoActualizar ?", nativeQuery = true)Puesto update(int id);
	@Query(value = "execute IN_PuestoInsertar ?, ?", nativeQuery = true)Puesto create(int id);
	

}

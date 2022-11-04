package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 
import com.example.Entities.TipoDireccion;

 @Repository

 
public interface TipoDireccionDao extends CrudRepository <TipoDireccion, Integer> {

	 	@Query(value = "execute SE_TipoDireccionSeleccionar ?", nativeQuery = true) TipoDireccion findbyId(int id);
		@Query(value = "execute EL_TipoDireccionEliminar ?", nativeQuery = true)TipoDireccion delete(int id);
		@Query(value = "execute AC_TipoDireccionActualizar ?", nativeQuery = true)TipoDireccion update(int id);
		@Query(value = "execute IN_TipoDireccionInsertar ?, ?", nativeQuery = true)TipoDireccion create(int id);
}

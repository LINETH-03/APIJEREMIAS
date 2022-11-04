package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Persona;

 

public interface PersonaDao extends CrudRepository <Persona, Integer>{
	@Query(value = "execute SE_PersonaSeleccionar ?", nativeQuery = true) Persona findbyId(int id);
	@Query(value = "execute EL_PersonaEliminar ?", nativeQuery = true)Persona delete(int id);
	@Query(value = "execute AC_PersonaActualizar ?", nativeQuery = true)Persona update(int id);
	@Query(value = "execute In_PersonaInsertar ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?", nativeQuery = true)Persona create(int id);

}

package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Departamento;
 

 

public interface DepartamentoDao extends CrudRepository <Departamento, Integer> {
	
	@Query(value = "execute SE_DepartamentoSeleccionar ?", nativeQuery = true)Departamento findbyId(int id);
	@Query(value = "execute EL_DepartamentoEliminar ?", nativeQuery = true)Departamento delete(int id);
	@Query(value = "execute AC_DepartamentoActualizar ?", nativeQuery = true)Departamento update(int id);
	@Query(value = "execute IN_DeptoInsertar ?, ?", nativeQuery = true)Departamento create(int id);

}

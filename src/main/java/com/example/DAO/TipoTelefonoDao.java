package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.TipoTelefono;

@Repository

public interface TipoTelefonoDao extends CrudRepository <TipoTelefono, Integer>{
	@Query(value = "execute SE_TipoTelefonoSeleccionar ?", nativeQuery = true)TipoTelefono findbyId(int id);
	@Query(value = "execute EL_TipoTelefonoEliminar ?", nativeQuery = true)TipoTelefono delete(int id);
	@Query(value = "execute AC_TipoTelefonoActualizar ?", nativeQuery = true)TipoTelefono update(int id);
	@Query(value = "execute IN_TipoTelefonoInsertar ?, ?", nativeQuery = true)TipoTelefono create(int id);

}

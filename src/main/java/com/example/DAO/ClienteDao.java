package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Cliente;
 

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Integer> {
	
	@Query(value = "execute SE_ClienteSeleccionar ?", nativeQuery = true) Cliente findbyId(int id);
	@Query(value = "execute EL_ClienteEliminar ?", nativeQuery = true)Cliente delete(int id);
	@Query(value = "execute AC_ClienteActualizar ?", nativeQuery = true)Cliente update(int id);
	@Query(value = "execute IN_ClienteInsertar ?, ?", nativeQuery = true)Cliente create(int id);

}

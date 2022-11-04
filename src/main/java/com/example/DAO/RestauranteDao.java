package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Restaurante;
 
@Repository
public interface RestauranteDao extends CrudRepository<Restaurante, Integer>{
	
	@Query(value = "execute SE_RestauranteSeleccionar ?", nativeQuery = true)Restaurante findbyId(int id);
	@Query(value = "execute EL_RestauranteEliminar ?", nativeQuery = true)Restaurante delete(int id);
	@Query(value = "execute AC_RestauranteActualizar ?", nativeQuery = true)Restaurante update(int id);
	@Query(value = "execute IN_RestauranteInsertar ?, ?", nativeQuery = true)Restaurante create(int id);

}

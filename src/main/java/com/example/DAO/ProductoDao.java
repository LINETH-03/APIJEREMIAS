package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Producto;
 

public interface ProductoDao extends CrudRepository<Producto, Integer>{
	
	@Query(value = "execute SE_ProductoSeleccionar ?", nativeQuery = true) Producto findbyId(int id);
	@Query(value = "execute EL_ProductoEliminar ?", nativeQuery = true)Producto delete(int id);
	@Query(value = "execute AC_ProductoActualizar ?", nativeQuery = true)Producto update(int id);
	@Query(value = "execute IN_ProdcutoInsertar ?, ?", nativeQuery = true)Producto create(int id);

}

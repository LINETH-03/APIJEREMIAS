package com.example.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.Menu;
 

 @Repository

public interface MenuDao extends CrudRepository <Menu, Integer>{

	@Query(value = "execute SE_MenuSeleccionar ?", nativeQuery = true) Menu findbyId(int id);
	@Query(value = "execute EL_MenuEliminar ?", nativeQuery = true)Menu delete(int id);
	@Query(value = "execute AC_MenuActualizar ?", nativeQuery = true)Menu update(int id);
	@Query(value = "execute IN_MenuInsertar ?, ?", nativeQuery = true)Menu create(int id);
}

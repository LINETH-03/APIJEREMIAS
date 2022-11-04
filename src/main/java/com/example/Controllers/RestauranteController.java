package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Restaurante;
 
import com.example.Services.RestautanteService;
 

@RestController
@RequestMapping("/RESTAURANTE")
public class RestauranteController {
	@Autowired
	RestautanteService resSEr;
	
	@GetMapping(value = "/{Id}")
	public Restaurante obtenercita(@PathVariable int Id) {
		return resSEr.findById(Id);
	}
	
	@DeleteMapping (value = "/{id}")
	 
	public  void eliminar(@PathVariable int id){
		
	  resSEr.deleteByIdC(id);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void crear(@PathVariable int id, @RequestBody Restaurante restaurante){
		
		resSEr.modify(id, restaurante);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void editar(@RequestBody Restaurante restaurante){
		
		resSEr.create(restaurante);
		
	}

}

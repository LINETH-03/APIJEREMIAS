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

import com.example.Entities.Producto;
import com.example.Services.ProductoService;

@RestController
@RequestMapping("/PRODUCTO")
public class ProductoController {
	
	@Autowired
	ProductoService Producser;
	
	
	@GetMapping(value = "/{Id}")
	public Producto obtenercita(@PathVariable int Id) {
		return Producser.findById(Id);
	}
	
	@DeleteMapping (value = "/{id}")
	 
	public  void eliminar(@PathVariable int id){
		
		Producser.deleteByIdC(id);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void crear(@PathVariable int id, @RequestBody Producto producto){
		
		Producser.modify(id, producto);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void editar(@RequestBody Producto producto){
		
		Producser.create(producto);
		
	}

}

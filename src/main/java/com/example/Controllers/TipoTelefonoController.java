package com.example.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

 
import com.example.Entities.TipoTelefono;
import com.example.Services.TipoTelefonoservice;

@RestController
@RequestMapping("/TIPOTELEFONO")
public class TipoTelefonoController {
	
	@Autowired
	TipoTelefonoservice Telservice;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TipoTelefono>buscarporId(@PathVariable int id){
		return ResponseEntity.ok(Telservice.findById(id));
		
	}
	
	@DeleteMapping (value = "/{id}")
	 
	public  void eliminar(@PathVariable int id){
		
	  Telservice.deleteByIdC(id);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void crear(@PathVariable int id, @RequestBody TipoTelefono Tipotelefono){
		
	  Telservice.modify(id, Tipotelefono);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void editar(@RequestBody TipoTelefono Tipotelefono){
		
	  Telservice.create(Tipotelefono);
		
	}

}

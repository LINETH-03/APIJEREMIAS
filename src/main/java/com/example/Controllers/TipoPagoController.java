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

import com.example.Entities.TipoPago;
import com.example.Services.TipoPagoService;

@RestController
@RequestMapping("/TIPOPAGO")
public class TipoPagoController {
	@Autowired
	TipoPagoService TipopagoServices;
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<TipoPago>buscarporId(@PathVariable int id){
		return ResponseEntity.ok(TipopagoServices.findById(id));
		
	}
	
	 
	@DeleteMapping (value = "/{id}")
 
	public  void eliminar(@PathVariable int id){
		
	  TipopagoServices.deleteByIdC(id);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void crear(@PathVariable int id, @RequestBody TipoPago Tipopago){
		
	  TipopagoServices.modify(id, Tipopago);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void editar(@RequestBody TipoPago Tipopago){
		
	  TipopagoServices.create(Tipopago);
		
	}
	
	
	
	
	
	
	

}

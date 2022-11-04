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

import com.example.Entities.Cliente;
import com.example.Services.ClienteService;

 
 

@RestController
@RequestMapping("/CLIENTE")
public class ClienteController {

	@Autowired
	ClienteService serv;
	
	@GetMapping(value = "/{Id}")
	public Cliente obtener(@PathVariable int Id) {
		return serv.findById(Id);
	}
	
	@DeleteMapping (value = "/{id}")
	 
	public  void eliminar(@PathVariable int id){
		
		serv.deleteByIdC(id);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void crear(@PathVariable int id, @RequestBody Cliente gen){
		
		serv.modify(id, gen);
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public  void editar(@RequestBody Cliente gen){
		
		serv.create(gen);
		
	}
}

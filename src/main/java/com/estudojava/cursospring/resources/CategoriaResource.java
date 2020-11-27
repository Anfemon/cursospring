package com.estudojava.cursospring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estudojava.cursospring.domain.Categoria;
import com.estudojava.cursospring.services.CategoriaService;

/* anotação ou diretiva do spring boot
 * 
 */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	/*
	 * metódo listar
	 */
	
	@Autowired
     private CategoriaService service;	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
		
	}

}

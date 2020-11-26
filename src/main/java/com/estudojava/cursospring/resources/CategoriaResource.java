package com.estudojava.cursospring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* anotação ou diretiva do spring boot
 * 
 */

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	/*
	 * metódo listar
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		
		return "Rest está funcionando";
	}

}

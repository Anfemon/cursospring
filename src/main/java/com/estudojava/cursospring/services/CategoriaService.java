package com.estudojava.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudojava.cursospring.domain.Categoria;
import com.estudojava.cursospring.repositories.CategoriaRepository;
import com.estudojava.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		 
		 	return obj.orElseThrow(() -> new ObjectNotFoundException
		 			( "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		} 

}

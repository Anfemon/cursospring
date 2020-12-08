package com.estudojava.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.estudojava.cursospring.domain.Estado;
import com.estudojava.cursospring.repositories.EstadoRepository;
import com.estudojava.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public Estado find(Integer id) {

		Optional<Estado> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Estado Invalido! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}

}

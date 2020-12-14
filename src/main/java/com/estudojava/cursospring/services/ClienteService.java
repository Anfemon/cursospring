package com.estudojava.cursospring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudojava.cursospring.domain.Cliente;
import com.estudojava.cursospring.repositories.ClienteRepository;
import com.estudojava.cursospring.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		 
		 	return obj.orElseThrow(() -> new ObjectNotFoundException
		 			( "Cliente não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		} 

}

package com.jeremiasleite.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremiasleite.cursomc.domain.Cliente;
import com.jeremiasleite.cursomc.repositories.ClienteRepository;
import com.jeremiasleite.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
	
	public Cliente find(Integer id) {
		return clienteRepository.findById(id)
				.orElseThrow(()-> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}

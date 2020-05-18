package com.jeremiasleite.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeremiasleite.cursomc.domain.Categoria;
import com.jeremiasleite.cursomc.repositories.CategoriaRepository;
import com.jeremiasleite.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria find(Integer id) {
		return categoriaRepository.findById(id)
				.orElseThrow(()-> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}

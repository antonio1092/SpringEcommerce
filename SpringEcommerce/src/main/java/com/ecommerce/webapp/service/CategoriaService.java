package com.ecommerce.webapp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.webapp.entity.Categoria;
import com.ecommerce.webapp.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public Categoria selectById(int id) {
	
		return categoriaRepository.selectById(id);
	}

	@Override
	public ArrayList<Categoria> viaualizza() {
		
		return categoriaRepository.visualizza();
	}
	


}

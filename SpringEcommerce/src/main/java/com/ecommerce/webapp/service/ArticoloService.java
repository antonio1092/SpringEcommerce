package com.ecommerce.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.webapp.entity.Articolo;
import com.ecommerce.webapp.repository.ArticoloRepository;

@Service
public class ArticoloService implements IArticoloService {

	@Autowired
	ArticoloRepository articoloRepository;

	@Override
	public void insArticolo(Articolo articolo) {
		
		articoloRepository.insArticolo(articolo);
		
	}
	
}

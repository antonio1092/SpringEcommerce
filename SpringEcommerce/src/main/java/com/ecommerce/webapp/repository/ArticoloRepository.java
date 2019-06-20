package com.ecommerce.webapp.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.entity.Articolo;

@Repository
public class ArticoloRepository implements IArticoloRepository {

	@Autowired
	EntityManager em;
	
	@Override
	public void insArticolo(Articolo articolo) {
		
		em.persist(articolo);
		em.flush();
		em.clear();
		
	}

}

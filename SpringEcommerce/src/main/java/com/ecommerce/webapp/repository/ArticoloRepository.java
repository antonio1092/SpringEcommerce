package com.ecommerce.webapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.entity.Articolo;

@Repository
@Transactional
public class ArticoloRepository implements IArticoloRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void insArticolo(Articolo articolo) {
		
		em.persist(articolo);
		em.flush();
		em.clear();
		
	}

}

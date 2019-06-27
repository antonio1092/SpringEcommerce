package com.ecommerce.webapp.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.entity.Categoria;

@Repository
@Transactional
public class CategoriaRepository implements ICategoriaRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Categoria selectById(int id) {
		
		return (Categoria) em.find(Categoria.class, id);
	}

}

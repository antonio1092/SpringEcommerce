package com.ecommerce.webapp.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.entity.Iva;

@Repository
@Transactional
public class IvaRepository implements IIvaRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Iva selectById(int id) {
		
		return (Iva) em.find(Iva.class, id);
	}

	@Override
	public ArrayList<Iva> visualizza() {
		
		return (ArrayList<Iva>) em.createQuery("from Iva").getResultList();
	}

}

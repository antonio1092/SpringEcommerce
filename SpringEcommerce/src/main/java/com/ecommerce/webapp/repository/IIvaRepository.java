package com.ecommerce.webapp.repository;

import java.util.ArrayList;

import com.ecommerce.webapp.entity.Iva;

public interface IIvaRepository {

	public Iva selectById(int id);
	public ArrayList<Iva> visualizza();
	
}

package com.ecommerce.webapp.service;

import java.util.ArrayList;

import com.ecommerce.webapp.entity.Iva;

public interface IIvaService {

	public Iva selectById(int id);
	public ArrayList<Iva> visualizza();
	
}

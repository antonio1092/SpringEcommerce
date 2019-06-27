package com.ecommerce.webapp.service;

import java.util.ArrayList;

import com.ecommerce.webapp.entity.Categoria;

public interface ICategoriaService {

	public Categoria selectById(int id);
	public ArrayList<Categoria> viaualizza();
	
}

package com.ecommerce.webapp.repository;

import java.util.ArrayList;

import com.ecommerce.webapp.entity.Categoria;

public interface ICategoriaRepository {

	public Categoria selectById(int id);
	public ArrayList<Categoria> visualizza();
	
}

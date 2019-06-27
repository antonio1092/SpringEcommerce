package com.ecommerce.webapp.repository;

import com.ecommerce.webapp.entity.Categoria;

public interface ICategoriaRepository {

	public Categoria selectById(int id);
	
}

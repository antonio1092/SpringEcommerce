package com.ecommerce.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.webapp.entity.Iva;
import com.ecommerce.webapp.repository.IvaRepository;

@Service
public class IvaService implements IIvaService {

	@Autowired
	IvaRepository ivaRepository;
	
	@Override
	public Iva selectById(int id) {
		
		return ivaRepository.selectById(id);
	}

}

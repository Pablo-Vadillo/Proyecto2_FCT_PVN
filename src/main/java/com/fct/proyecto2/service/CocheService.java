package com.fct.proyecto2.service;

import org.springframework.stereotype.Service;

import com.fct.proyecto2.model.Coche;

@Service
public class CocheService implements CocheServiceImpl {
	
	@Override
	public Coche crearCoche(String marca, String modelo) {
		return new Coche(marca,modelo);
	}

}

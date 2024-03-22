package com.fct.proyecto2.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fct.proyecto2.model.Coche;

@Service
public class CocheService implements CocheServiceImpl {
	
	private final HashMap<String, Coche> coches = new HashMap<>();
	
	@Override
	public Coche crearCoche(String marca, String modelo) {
		Coche coche = new Coche (marca,modelo);
		coches.put(marca,coche);
		return coche;
	}

	@Override
	public void eliminarCoche(String marca) {
		coches.remove(marca);	
	}

	@Override
	public List<Coche> obtenerTodosLosCoches() {
		return new ArrayList<>(coches.values());
	}

}

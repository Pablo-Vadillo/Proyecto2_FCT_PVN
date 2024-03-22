package com.fct.proyecto2.service;

import java.util.List;

import com.fct.proyecto2.model.Coche;

public interface CocheServiceImpl {
	Coche crearCoche(String marca,String modelo);
	void eliminarCoche(String marca);
	List<Coche>obtenerTodosLosCoches();
}

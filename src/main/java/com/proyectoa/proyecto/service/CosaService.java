package com.proyectoa.proyecto.service;

import java.util.List;

import com.proyectoa.proyecto.bo.Cosa;

public interface CosaService {

	List<Cosa> listarCosas();

	Cosa obtenerCosa(Short id);

	void nuevaCosa(Cosa cosa);

	void eliminarCosa(Short id);

}

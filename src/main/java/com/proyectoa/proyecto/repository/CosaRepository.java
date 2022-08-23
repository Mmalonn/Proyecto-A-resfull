package com.proyectoa.proyecto.repository;

import java.util.List;

import com.proyectoa.proyecto.bo.Cosa;

public interface CosaRepository {

	List<Cosa> obtenerCosas();

	Cosa obtenerCosa(Short id);

	void nuevaCosa(Cosa cosa);

	void eliminarCosa(Short id);

}

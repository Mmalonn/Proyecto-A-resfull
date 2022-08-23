package com.proyectoa.proyecto.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyectoa.proyecto.bo.Cosa;
import com.proyectoa.proyecto.repository.CosaRepository;

@Repository
public class CosaRepositoryHibernateImpl implements CosaRepository {

	@Autowired
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Cosa> obtenerCosas() {
		return entityManager.createQuery("from Cosa").getResultList();
	}

	@Override
	public Cosa obtenerCosa(Short id) {
		return entityManager.find(Cosa.class, id);
	}

	@Override
	public void nuevaCosa(Cosa cosa) {
		entityManager.persist(cosa);
	}

	@Override
	public void eliminarCosa(Short id) {
		Cosa cosa = entityManager.find(Cosa.class, id);
		entityManager.remove(cosa);
	}

	@Override
	public void editarCosa(Cosa cosa, Short id) {
		Cosa obtenida = entityManager.find(Cosa.class, id);
		obtenida.setNombre(cosa.getNombre());
		obtenida.setCantidad(cosa.getCantidad());
		entityManager.merge(obtenida);
	}

}

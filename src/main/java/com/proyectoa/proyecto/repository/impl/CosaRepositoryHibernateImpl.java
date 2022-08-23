package com.proyectoa.proyecto.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyectoa.proyecto.bo.Cosa;
import com.proyectoa.proyecto.repository.CosaRepository;

@Repository
public class CosaRepositoryHibernateImpl implements CosaRepository {

	@Autowired EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cosa> obtenerCosas() {
		return entityManager.createQuery("from Cosa").getResultList();
	}

}

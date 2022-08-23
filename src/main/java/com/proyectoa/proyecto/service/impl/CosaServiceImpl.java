package com.proyectoa.proyecto.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoa.proyecto.bo.Cosa;
import com.proyectoa.proyecto.repository.CosaRepository;
import com.proyectoa.proyecto.service.CosaService;

@Service
@Transactional
public class CosaServiceImpl implements CosaService {

	@Autowired CosaRepository cosaRepository;
	
	@Override
	public List<Cosa> listarCosas() {
		return cosaRepository.obtenerCosas();
	}

	@Override
	public Cosa obtenerCosa(Short id) {
		return cosaRepository.obtenerCosa(id);
	}

	@Override
	public void nuevaCosa(Cosa cosa) {
		cosaRepository.nuevaCosa(cosa);
	}

}

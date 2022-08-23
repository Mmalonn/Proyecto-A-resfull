package com.proyectoa.proyecto.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoa.proyecto.bo.Cosa;
import com.proyectoa.proyecto.rest.dto.CosaDto;
import com.proyectoa.proyecto.service.CosaService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CosaRestController {

	@Autowired
	CosaService cosaService;

	@GetMapping("/cosas")
	public List<CosaDto> listarCosas() {
		List<Cosa> cosas = cosaService.listarCosas();
		List<CosaDto> cosasDto = new ArrayList<CosaDto>();
		for (Cosa cosa : cosas) {
			cosasDto.add(new CosaDto(cosa));
		}
		return cosasDto;
	}

	@GetMapping("/cosas/{id}")
	public CosaDto obtenerCosa(@PathVariable Short id) {
		Cosa cosa = cosaService.obtenerCosa(id);
		CosaDto cosaDto = new CosaDto(cosa);
		return cosaDto;
	}

	@PostMapping("/cosas")
	public void nuevaCosa(@RequestBody CosaDto cosaDto) {
		Cosa cosa = new Cosa(cosaDto);
		cosaService.nuevaCosa(cosa);
	}

	@DeleteMapping("/cosas/{id}")
	public void eliminarCosa(@PathVariable Short id) {
		cosaService.eliminarCosa(id);
	}
	
	@PutMapping("/cosas/{id}")
	public void editarCosa(@PathVariable Short id, @RequestBody CosaDto cosaDto) {
		Cosa cosa = new Cosa (cosaDto);
		cosaService.editarCosa(cosa, id);
	}
}

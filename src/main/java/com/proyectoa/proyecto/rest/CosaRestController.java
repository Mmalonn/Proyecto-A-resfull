package com.proyectoa.proyecto.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoa.proyecto.bo.Cosa;
import com.proyectoa.proyecto.rest.dto.CosaDto;
import com.proyectoa.proyecto.service.CosaService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CosaRestController {

	@Autowired CosaService cosaService;
	
	@GetMapping("/cosas")
	public List<CosaDto> listarCosas(){
		List<Cosa> cosas= cosaService.listarCosas();
		List<CosaDto> cosasDto= new ArrayList<CosaDto>();
		for(Cosa cosa : cosas) {
			cosasDto.add(new CosaDto(cosa));
		}
		return cosasDto;
	}
}

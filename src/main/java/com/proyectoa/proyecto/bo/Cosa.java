package com.proyectoa.proyecto.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.proyectoa.proyecto.rest.dto.CosaDto;

@Entity
public class Cosa {
	
	@Id
	@GeneratedValue
	private short id;
	private String nombre;
	private short cantidad;
	
	public Cosa() {}
		
	public Cosa(short id, String nombre, short cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public Cosa(CosaDto cosaDto) {
		this.id = cosaDto.getId();
		this.nombre = cosaDto.getNombre();
		this.cantidad = cosaDto.getCantidad();
	}

	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public short getCantidad() {
		return cantidad;
	}
	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}
	
	

}

package com.proyectoa.proyecto.rest.dto;

import com.proyectoa.proyecto.bo.Cosa;

public class CosaDto {

	private short id;
	private String nombre;
	private short cantidad;

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

	public CosaDto(Cosa cosa) {
		this.id = cosa.getId();
		this.nombre = cosa.getNombre();
		this.cantidad = cosa.getCantidad();
	}

}

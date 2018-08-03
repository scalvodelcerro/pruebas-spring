package com.scalvo.profiles.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Producto {
	private @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
	private @NotNull String nombre;
	private @NotNull BigDecimal precio;

	private Producto() {
	}

	public Producto(String nombre, BigDecimal precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}
}

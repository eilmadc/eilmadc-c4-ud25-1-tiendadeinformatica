/**
 * 
 */
package com.ex01.c4.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "articulos")
public class Articulo {

	// ------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private Double precio;

	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricante fabricante;
	// ------------Constructors----------------

	public Articulo() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fabricante
	 */
	public Articulo(Long codigo, String nombre, Double precio, Fabricante fabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	// ------------Getters y Setters----------------


	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the fabricante
	 */
	public Fabricante getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}


	// ------------Methods----------------
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante
				+ "]";
	}

	
	
}

/**
 * 
 */
package com.ex01.c4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "fabricantes")
public class Fabricante {

	// ------------Atributos----------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(name = "nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Articulo> articulo;

	// ------------Constructors----------------
	public Fabricante() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Fabricante(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
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
	 * @return articulo
	 */

	
	@JsonIgnore 
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}
}

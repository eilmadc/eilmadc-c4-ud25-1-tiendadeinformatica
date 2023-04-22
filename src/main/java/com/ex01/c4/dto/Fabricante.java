/**
 * 
 */
package com.ex01.c4.dto;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	private List<Fabricante> fabricante;

	// ------------Constructors----------------
	public Fabricante() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param fabricante
	 */
	public Fabricante(Long codigo, String nombre, List<Fabricante> fabricante) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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
	 * @return the fabricante
	 */
	public List<Fabricante> getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(List<Fabricante> fabricante) {
		this.fabricante = fabricante;
	}

	// ------------Methods----------------
	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", fabricante=" + fabricante + "]";
	}

}

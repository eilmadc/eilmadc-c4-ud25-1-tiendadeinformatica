/**
 * 
 */
package com.ex01.c4.service;

import java.util.List;

import com.ex01.c4.dto.Fabricante;

/**
 * @author elena-01
 *
 */
public interface FabricanteService {

	public List<Fabricante> listFabricantes();

	public Fabricante saveFabricante(Fabricante fabricante);

	public Fabricante fabricanteById(Long codigo);

	public Fabricante updateFabricante(Fabricante fabricante);

	public void deleteFabricante(Long codigo);

}

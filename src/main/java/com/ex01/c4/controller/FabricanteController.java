/**
 * 
 */
package com.ex01.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex01.c4.dto.Fabricante;
import com.ex01.c4.service.FabricanteServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	@GetMapping("/fabricantes")
	public List<Fabricante> listFabricantes() {
		return fabricanteServiceImpl.listFabricantes();
	}

	@PostMapping("/fabricantes")
	public Fabricante saveFabricante(@RequestBody Fabricante fabricante) {

		return fabricanteServiceImpl.saveFabricante(fabricante);
	}

	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteById(@PathVariable(name = "codigo") Long codigo) {

		Fabricante fabricante_bid = new Fabricante();

		fabricante_bid = fabricanteServiceImpl.fabricanteById(codigo);

		System.out.println("Fabricante ById: " + fabricante_bid);

		return fabricante_bid;
	}

	@PutMapping("/fabricantes/{codigo}")
	public Fabricante updateFabricante(@PathVariable(name = "codigo") Long codigo, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_selected = new Fabricante();
		Fabricante fabricante_updated = new Fabricante();

		fabricante_selected = fabricanteServiceImpl.fabricanteById(codigo);

		fabricante_selected.setNombre(fabricante.getNombre());

		fabricante_updated = fabricanteServiceImpl.updateFabricante(fabricante_selected);

		System.out.println("El fabricante updated es: " + fabricante_updated);

		return fabricante_updated;
	}

	@DeleteMapping("/fabricantes/{codigo}")
	public void deleteFabricante(@PathVariable(name = "codigo") Long codigo) {
		fabricanteServiceImpl.deleteFabricante(codigo);
	}

}

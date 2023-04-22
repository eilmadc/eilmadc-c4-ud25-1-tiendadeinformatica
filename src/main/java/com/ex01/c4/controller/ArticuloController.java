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

import com.ex01.c4.dto.Articulo;
import com.ex01.c4.service.ArticuloServiceImpl;


/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	
	@GetMapping("/articulos")
	public List<Articulo> listArticulos(){
		return articuloServiceImpl.listArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulo saveArticulo(@RequestBody Articulo articulo) {
		
		return articuloServiceImpl.saveArticulo(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulo articuloById(@PathVariable(name="codigo") Long codigo) {
		
		Articulo articulo_bid= new Articulo();
		
		articulo_bid=articuloServiceImpl.articuloByID(codigo);
		
		System.out.println("Articulo ById: "+articulo_bid);
		
		return articulo_bid;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulo updateArticulo(@PathVariable(name="codigo")Long codigo,@RequestBody Articulo articulo) {
		
		Articulo articulo_selected= new Articulo();
		Articulo articulo_updated= new Articulo();
		
		articulo_selected= articuloServiceImpl.articuloByID(codigo);
		
		articulo_selected.setNombre(articulo.getNombre());
		articulo_selected.setPrecio(articulo.getPrecio());
		articulo_selected.setFabricante(articulo.getFabricante());
		
		articulo_updated = articuloServiceImpl.updateArticulo(articulo_selected);
		
		System.out.println("El articulo updated es: "+ articulo_updated);
		
		return articulo_updated;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void deleteArticulo(@PathVariable(name="codigo")Long codigo) {
		articuloServiceImpl.deleteArticulo(codigo);
	}
	
}

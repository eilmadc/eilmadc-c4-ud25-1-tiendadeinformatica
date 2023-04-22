/**
 * 
 */
package com.ex01.c4.service;

import java.util.List;

import com.ex01.c4.dto.Articulo;

/**
 * @author elena-01
 *
 */
public interface ArticuloService {
	
	public List<Articulo> listArticulos();//READ
	
	public Articulo saveArticulo(Articulo articulo);
	
	public Articulo articuloByID(Long codigo);
	
	public Articulo updateArticulo(Articulo articulo);
	
	public void deleteArticulo(Long codigo);

}

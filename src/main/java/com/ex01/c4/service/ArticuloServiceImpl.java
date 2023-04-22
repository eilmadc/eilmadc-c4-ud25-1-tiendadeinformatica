/**
 * 
 */
package com.ex01.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex01.c4.dao.IArticuloDAO;
import com.ex01.c4.dto.Articulo;

/**
 * @author elena-01
 *
 */
@Service
public class ArticuloServiceImpl implements ArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listArticulos() {

		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo saveArticulo(Articulo articulo) {

		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloByID(Long codigo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo updateArticulo(Articulo articulo) {
		// TODO Auto-generated method stub
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void deleteArticulo(Long codigo) {
		// TODO Auto-generated method stub
		iArticuloDAO.deleteById(codigo);
	}

}

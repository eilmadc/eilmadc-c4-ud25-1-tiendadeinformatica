/**
 * 
 */
package com.ex01.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex01.c4.dao.IFabricanteDAO;
import com.ex01.c4.dto.Fabricante;

/**
 * @author elena-01
 *
 */

@Service
public class FabricanteServiceImpl implements FabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listFabricantes() {

		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante saveFabricante(Fabricante fabricante) {

		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteById(Long codigo) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante updateFabricante(Fabricante fabricante) {
		// TODO Auto-generated method stub
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long codigo) {
		// TODO Auto-generated method stub
		iFabricanteDAO.deleteById(codigo);
	}

}

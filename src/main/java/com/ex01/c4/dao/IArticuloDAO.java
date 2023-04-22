/**
 * 
 */
package com.ex01.c4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex01.c4.dto.Articulo;
import com.ex01.c4.dto.Fabricante;

/**
 * @author elena-01
 *
 */
public interface IArticuloDAO extends JpaRepository<Articulo, Long> {
}

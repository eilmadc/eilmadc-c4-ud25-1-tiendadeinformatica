/**
 * 
 */
package com.ex01.c4.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ex01.c4.dto.Articulo;
/**
 * @author elena-01
 *
 */
public interface IArticuloDAO extends JpaRepository<Articulo, Long> {
}

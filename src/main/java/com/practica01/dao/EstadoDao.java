/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.dao;

import com.practica01.domain.Estado;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author joses
 */
public interface EstadoDao extends CrudRepository<Estado, Long> {
    
}

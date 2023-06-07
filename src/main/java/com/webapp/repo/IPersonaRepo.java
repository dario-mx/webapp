/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webapp.repo;

import com.webapp.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DARIO.ZUNIGA
 */
public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
  
}

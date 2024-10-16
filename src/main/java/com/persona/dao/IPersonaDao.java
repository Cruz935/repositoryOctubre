package com.persona.dao;

/*
 * ORG: ORGANIZACION (INTERNO)		COM: COMERCIAL (VENDER)
 * 
 * EN LA INTERFACE NO SE PROGRAMA SOLO SE AGREGAN LOS METODOS A IMPLEMENTAR
 * 
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.persona.modelo.Persona;

@Repository
public interface IPersonaDao extends CrudRepository<Persona, Serializable>{

	/*
	 * NO SE PROGRAMA EL CRUD PORQUE YA EXISTEN LOS METOODS: save,
	 * delete, updete....
	 */
	
}

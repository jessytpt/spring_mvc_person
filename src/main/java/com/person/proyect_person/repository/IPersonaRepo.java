package com.person.proyect_person.repository;

import com.person.proyect_person.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}

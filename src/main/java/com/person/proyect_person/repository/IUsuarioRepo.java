package com.person.proyect_person.repository;

import com.person.proyect_person.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
}

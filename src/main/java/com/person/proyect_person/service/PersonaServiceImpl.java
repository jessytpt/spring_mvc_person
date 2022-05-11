package com.person.proyect_person.service;

import com.person.proyect_person.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    @Qualifier("persona1")
    private IPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}

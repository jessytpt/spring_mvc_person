package com.person.proyect_person.repository;

import com.person.proyect_person.ProyectPersonApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class PersonaRepoImplRepo implements IPersonaRepo {
    private static Logger LOG = LoggerFactory.getLogger(ProyectPersonApplication.class);

    @Override
    public void registrar(String nombre) {
        LOG.info("Se registro a "+ nombre);
    }
}

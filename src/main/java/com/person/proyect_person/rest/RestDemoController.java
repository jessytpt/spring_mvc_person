package com.person.proyect_person.rest;

import com.person.proyect_person.model.Persona;
import com.person.proyect_person.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivilegedAction;
import java.util.List;

@RestController
@RequestMapping("/person")
public class RestDemoController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping("/all")
    public List<Persona> listar(){
        return repo.findAll();

    }

    @PostMapping("/new")
    public void insertar(@RequestBody Persona per){
        repo.save(per);
    }

    @PutMapping("/modify")
    public void modificar(@RequestBody Persona per){
        repo.save(per);
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar( @PathVariable Integer id){
        repo.deleteById(id);
    }
}

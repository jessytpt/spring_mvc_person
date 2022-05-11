package com.person.proyect_person.controller;

import com.person.proyect_person.model.Persona;
import com.person.proyect_person.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        Persona p = new Persona(1,"Jess");
        repo.save(p);
        model.addAttribute("name", name);
        return "greeting";
    }
}

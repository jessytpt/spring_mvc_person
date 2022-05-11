package com.person.proyect_person;

import com.person.proyect_person.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectPersonApplication  implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(ProyectPersonApplication.class);

	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(ProyectPersonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	service.registrar("Sé imparable!");
	}
}

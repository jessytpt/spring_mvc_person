package com.person.proyect_person;

import com.person.proyect_person.model.Usuario;
import com.person.proyect_person.repository.IUsuarioRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ProyectPersonApplicationTests {

	@Autowired
	private IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {

	}

	@Test
	public void crearUsuarioTest(){
		Usuario us = new Usuario();
		us.setId(2);
		us.setNombre("mitocode");
		us.setClave(encoder.encode("123"));

		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}

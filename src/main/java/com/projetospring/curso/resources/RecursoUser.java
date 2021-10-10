package com.projetospring.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.curso.entidades.User;

@RestController
@RequestMapping(value = "/users")
public class RecursoUser {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "Maria@gmail.com", "9999999", "123455");
	    return ResponseEntity.ok().body(u);
	}

	
}

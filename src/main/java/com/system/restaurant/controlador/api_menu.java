package com.system.restaurant.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.restaurant.modelo.Usuario;

@RestController
@RequestMapping("/Api")
public class api_menu {

	@GetMapping("/menu")
	public Usuario obtenerUser() {
		Usuario user = new Usuario("toñito", "velazco", "vel@gmail.com", "123");
		return user;
		
	}
}

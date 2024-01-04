package com.system.restaurant.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/registro")
    public String login() {
        return "registro"; // Retorna la vista de inicio de sesión
    }
    
    @GetMapping("/")
    public String home() {
    	return "index";
    }
   
}

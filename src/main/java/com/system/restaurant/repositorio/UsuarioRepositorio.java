package com.system.restaurant.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.restaurant.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}

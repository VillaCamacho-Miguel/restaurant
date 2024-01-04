package com.system.restaurant.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.system.restaurant.modelo.Usuario;
import com.system.restaurant.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio, UserDetailsService{

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@Override
	public List<Usuario> listarClientes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario cte) {
		// TODO Auto-generated method stub
		return repositorio.save(cte);
	}

	@Override
	public Usuario obtenerUsuarioID(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario cte) {
		// TODO Auto-generated method stub
		return repositorio.save(cte);
	}

	@Override
	public void eliminarUsuario(Long id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

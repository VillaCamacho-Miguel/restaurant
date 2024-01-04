package com.system.restaurant.negocio;

import java.util.List;

import com.system.restaurant.modelo.Usuario;


public interface UsuarioServicio  {
public List<Usuario> listarClientes();
	
	public Usuario guardarUsuario(Usuario cte);
	
	public Usuario obtenerUsuarioID(Long id);
	
	public Usuario actualizarUsuario(Usuario cte);
	
	public void eliminarUsuario(Long id);
		
}

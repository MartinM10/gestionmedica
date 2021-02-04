package com.sinensia.gestionmedica.backend.business.services;

import java.util.List;

import com.sinensia.gestionmedica.backend.business.model.Usuario;

public interface UsuarioServices {
	
	public Usuario read(String dni);

	public List<Usuario> getAll();

	public Usuario save(Usuario usuario);
}

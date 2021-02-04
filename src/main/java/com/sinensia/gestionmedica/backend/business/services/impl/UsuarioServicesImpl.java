package com.sinensia.gestionmedica.backend.business.services.impl;

import java.util.List;
import java.util.Optional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.gestionmedica.backend.business.model.Usuario;
import com.sinensia.gestionmedica.backend.business.services.UsuarioServices;
import com.sinensia.gestionmedica.backend.integration.model.UsuarioPL;
import com.sinensia.gestionmedica.backend.integration.repositories.UsuarioPLRepository;

@Service
public class UsuarioServicesImpl implements UsuarioServices {

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	@Autowired
	private UsuarioPLRepository usuarioPLRepository;

	@Override
	public Usuario read(String dni) {

		Optional<UsuarioPL> optionalUsuarioPL = usuarioPLRepository.findById(dni);

		UsuarioPL usuarioPL = optionalUsuarioPL.isPresent() ? optionalUsuarioPL.get() : null;

		// Tenemos que convertir un AlmacenPL => Almacen

		Usuario usuario = dozerBeanMapper.map(usuarioPL, Usuario.class);

		return usuario;
	}

	@Override
	public List<Usuario> getAll() {
		return null;
	}

	@Override
	public Usuario save(Usuario usuario) {
		return null;
	}

}

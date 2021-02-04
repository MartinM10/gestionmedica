package com.sinensia.gestionmedica.backend.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
		List<UsuarioPL> usuariosPL = usuarioPLRepository.findAll();

		List<Usuario> usuarios = new ArrayList<>();

		for (UsuarioPL usuarioPL : usuariosPL) {
			usuarios.add(dozerBeanMapper.map(usuarioPL, Usuario.class));
		}

		return usuarios;
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {

		UsuarioPL usuarioPL = dozerBeanMapper.map(usuario, UsuarioPL.class);

		UsuarioPL createdUsuarioPL = usuarioPLRepository.save(usuarioPL);

		Usuario createdUsuario = dozerBeanMapper.map(createdUsuarioPL, Usuario.class);

		return createdUsuario;
	}

}

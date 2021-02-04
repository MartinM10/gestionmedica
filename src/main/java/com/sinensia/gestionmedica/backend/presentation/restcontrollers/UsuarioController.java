package com.sinensia.gestionmedica.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.gestionmedica.backend.business.model.Usuario;
import com.sinensia.gestionmedica.backend.business.services.UsuarioServices;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServices usuarioServices;

	@GetMapping("/{dni}")
	public Usuario getById(@PathVariable("dni") String dni) {
		return usuarioServices.read(dni);
	}

	@GetMapping
	public List<Usuario> getAll() {
		return usuarioServices.getAll();
	}

	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioServices.save(usuario);
	}

}

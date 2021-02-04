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

import com.sinensia.gestionmedica.backend.business.model.Lectura;
import com.sinensia.gestionmedica.backend.business.services.LecturaServices;

@RestController
@CrossOrigin
@RequestMapping("/lecturas")
public class LecturaController {

	@Autowired
	private LecturaServices lecturaServices;

	@GetMapping("/{id}")
	public Lectura getById(@PathVariable("id") int id) {
		return lecturaServices.read(id);
	}

	@GetMapping
	public List<Lectura> getAll() {
		return lecturaServices.getAll();
	}

	@PostMapping
	public Lectura create(@RequestBody Lectura lectura) {
		return lecturaServices.save(lectura);
	}
	
	@GetMapping("/usuario/{dni}")
	public List<Lectura> getAllById(@PathVariable("dni") String dni) {
		return lecturaServices.findByDniUsuario(dni);
	}

}

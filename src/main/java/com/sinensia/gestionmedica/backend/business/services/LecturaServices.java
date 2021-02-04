package com.sinensia.gestionmedica.backend.business.services;

import java.util.List;

import com.sinensia.gestionmedica.backend.business.model.Lectura;

public interface LecturaServices {

	public Lectura read(int id);

	public List<Lectura> getAll();

	public Lectura save(Lectura lectura);

	public List<Lectura> findByDniUsuario(String dni);
}

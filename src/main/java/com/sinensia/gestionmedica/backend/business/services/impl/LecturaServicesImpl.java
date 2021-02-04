package com.sinensia.gestionmedica.backend.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.gestionmedica.backend.business.model.Lectura;
import com.sinensia.gestionmedica.backend.business.services.LecturaServices;
import com.sinensia.gestionmedica.backend.integration.model.LecturaPL;
import com.sinensia.gestionmedica.backend.integration.repositories.LecturaPLRepository;

@Service
public class LecturaServicesImpl implements LecturaServices {

	@Autowired
	private LecturaPLRepository lecturaPLRepository;

	@Autowired
	private DozerBeanMapper dozerBeanMapper;

	@Override
	public Lectura read(int id) {

		Optional<LecturaPL> optionalLecturaPL = lecturaPLRepository.findById(id);

		LecturaPL lecturaPL = optionalLecturaPL.isPresent() ? optionalLecturaPL.get() : null;

		Lectura lectura = dozerBeanMapper.map(lecturaPL, Lectura.class);

		return lectura;
	}

	@Override
	public List<Lectura> getAll() {
		List<LecturaPL> lecturasPL = lecturaPLRepository.findAll();

		List<Lectura> lecturas = new ArrayList<>();

		for (LecturaPL lecturaPL : lecturasPL) {
			lecturas.add(dozerBeanMapper.map(lecturaPL, Lectura.class));
		}

		return lecturas;
	}

	@Override
	@Transactional
	public Lectura save(Lectura lectura) {

		LecturaPL lecturaPL = dozerBeanMapper.map(lectura, LecturaPL.class);

		LecturaPL createdLecturaPL = lecturaPLRepository.save(lecturaPL);

		Lectura createdLectura = dozerBeanMapper.map(createdLecturaPL, Lectura.class);

		/*
		 * DUDA PARA PREGUNTAR A JORDI, NO MUESTRA TODOS LOS CAMPOS (ERROR EN EL MAPEO)
		 */
		/*
		 * System.out.println(lectura); System.out.println(createdLecturaPL);
		 * System.out.println(createdLectura);
		 */
		return createdLectura;
	}

	@Override
	public List<Lectura> findByDniUsuario(String dni) {

		List<LecturaPL> lecturasPL = lecturaPLRepository.findByDni(dni);

		List<Lectura> lecturas = new ArrayList<>();

		for (LecturaPL lecturaPL : lecturasPL) {
			lecturas.add(dozerBeanMapper.map(lecturaPL, Lectura.class));
		}

		return lecturas;
	}

}

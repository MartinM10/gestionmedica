package com.sinensia.gestionmedica.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.gestionmedica.backend.integration.model.LecturaPL;


@Repository
public interface LecturaPLRepository extends JpaRepository<LecturaPL, Integer> {
	@Query("SELECT l FROM LecturaPL l WHERE l.usuario.dni = :dni")
	public List<LecturaPL> findByDni(String dni);

}

package com.sinensia.gestionmedica.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.gestionmedica.backend.integration.model.LecturaPL;
import com.sinensia.gestionmedica.backend.integration.model.UsuarioPL;


@Repository
public interface LecturaPLRepository extends JpaRepository<LecturaPL, Integer> {
	
	/*Otra forma de hacerlo pero usamos mejor la magia de JPA
	 * @Query("SELECT l FROM LecturaPL l WHERE l.usuario.dni = :dni")
	public List<LecturaPL> findByDni(String dni);*/
	
	public List<LecturaPL> findByUsuario(UsuarioPL usuario);
	
	public List<LecturaPL> findByUsuarioDni(String dni);
	
}

package com.sinensia.gestionmedica.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinensia.gestionmedica.backend.business.model.Lectura;
import com.sinensia.gestionmedica.backend.business.model.Usuario;
import com.sinensia.gestionmedica.backend.business.services.LecturaServices;
import com.sinensia.gestionmedica.backend.business.services.UsuarioServices;

@Controller
@RequestMapping("/gestionmedica")
public class AppController {

	@Autowired
	private UsuarioServices usuarioServices;

	@Autowired
	private LecturaServices lecturaServices;

	@RequestMapping(value = { "/home", "/", "" })
	public String home() {
		return "index";
	}

	@RequestMapping("/listado-usuarios")
	public String getListadoUsuarios(Model model) {

		List<Usuario> usuarios = usuarioServices.getAll();

		model.addAttribute("usuarios", usuarios);
		
		return "usuarios";
	}

	@RequestMapping("/listado-lecturas")
	public String getListadoLecturas(Model model) {

		List<Lectura> lecturas = lecturaServices.getAll();

		model.addAttribute("lecturas", lecturas);

		return "lecturas";
	}

	@RequestMapping("/lecturas/usuario/{dni}")
	public String getLecturasByUsuario(@PathVariable String dni, Model model) {
		List<Lectura> lecturas = lecturaServices.findByDniUsuario(dni);
		
		model.addAttribute("lecturas", lecturas);
		return "lecturas";
	}
	
	
	@GetMapping("/crear-usuario")
	public String formAltaUsuario() {
		return "altausuario";
	}
	
	@PostMapping("/crear-usuario")
	public String formAltaUsuarioPost() {
		return "usuarios";
	}

	/*
	 * @RequestMapping("/detalle-almacen/{codigo}") public String
	 * getDetalleAlmacen(Model model, @PathVariable int codigo) {
	 * 
	 * Almacen almacen = almacenServices.read(codigo);
	 * 
	 * model.addAttribute("almacen", almacen);
	 * 
	 * return "detalleAlmacen"; }
	 */

}

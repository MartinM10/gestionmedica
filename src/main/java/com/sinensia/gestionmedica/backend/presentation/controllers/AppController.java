package com.sinensia.gestionmedica.backend.presentation.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/lecturas/{dni}/usuario")
	public String getLecturasByUsuario(@PathVariable String dni, Model model) {
		List<Lectura> lecturas = lecturaServices.findByDniUsuario(dni);

		model.addAttribute("lecturas", lecturas);
		return "lecturas";
	}

	@GetMapping("/alta-usuario")
	public ModelAndView formAltaUsuario() {
		return new ModelAndView("altausuario", "usuarioForm", new Usuario());
	}

	@PostMapping("/alta-usuario")
	public String formAltaUsuarioPost(@ModelAttribute("usuarioForm") Usuario usuario, BindingResult result,
			ModelMap model) {

		String fecha = result.getFieldValue("fechaNacimiento").toString();

		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
			usuario.setFechaNacimiento(date);
		} catch (ParseException e) {
			System.out.println("Error en el parseo de fecha");
		}

		usuarioServices.save(usuario);

		return "usuarios";
	}

}

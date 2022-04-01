package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.CitaMedicaTO;

import ec.edu.uce.service.ICitaMedicaService;

@Controller
@RequestMapping("/citasmedicas/")
public class GestorCitaMedicaController {
	
	@Autowired
	private ICitaMedicaService gestorCitaMedServ;
	
	@GetMapping("citaMedicaNuevo")
	public String obtenerPaginaIngresoDatos(CitaMedica citaMedica) {
		
		return "citaMedicaNuevo";
	}
	@PostMapping("insertar")
	public String insertarEstudiante(CitaMedica citaMedica, BindingResult result, Model modelo, RedirectAttributes redirectAttrs) {
		CitaMedica cime = new CitaMedica();
		this.gestorCitaMedServ.insertarCitaMedica("", null, null, null, null, null);	
		redirectAttrs.addFlashAttribute("mensaje", "Estudiante Guardado");
		return "redirect:todos";
		
	}
	@GetMapping("citaMedicaActualiza/{idCitaMedica}")
	public String obtenerPaginaActualizarDatos(@PathVariable("idCitaMedica")Integer idCitaMedica, CitaMedica citaMedica, Model modelo) {
		CitaMedica cime = this.gestorCitaMedServ.buscarPorId(idCitaMedica);
		
//		modelo.addAttribute("citaMedica", citaMedica);
		
		return "citaMedicaActualiza";
		
	}
	@PutMapping("actualizar/{idCitaMedica}")
	public String actualizarEstudiante(@PathVariable("idCitaMedica")Integer idEstudiante,CitaMedica citaMedica) {
		citaMedica.setId(idCitaMedica);
		this.gestorCitaMedServ.actualizarCita(null, null, null, null);
		return "index";
	}
	
	
	
	

}

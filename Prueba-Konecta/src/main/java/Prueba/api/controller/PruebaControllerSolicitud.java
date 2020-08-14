package Prueba.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Prueba.api.entity.Solucitud;
import Prueba.api.service.IPruebaServiceSolicitud;

@RestController
@RequestMapping("/api")
public class PruebaControllerSolicitud {
	
	
	@Autowired
	private IPruebaServiceSolicitud servicePrueba;
	
	@GetMapping("/solicitud")
	public List<Solucitud> buscarTodos(){
		return servicePrueba.buscarTodos();
	}
	
	@PostMapping("/solicitud") 
	public Solucitud guardar(@RequestBody Solucitud solicitud) {
		servicePrueba.guardar(solicitud);
		return solicitud;
	}
	
	@PutMapping("/solicitud")
	public Solucitud modificar(@RequestBody Solucitud solicitud) {
		servicePrueba.guardar(solicitud);
		return solicitud;
	} 
	
	@DeleteMapping("/solicitud/{id}")
	public String eliminar(@PathVariable("id") String id) {
		servicePrueba.eliminar(id);
		return "Registro Eliminado";
	}

}

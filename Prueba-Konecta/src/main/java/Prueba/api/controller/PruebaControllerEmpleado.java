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

import Prueba.api.entity.Empleado;
import Prueba.api.service.IPruebaServiceEmpleado;

@RestController
@RequestMapping("/api")
public class PruebaControllerEmpleado {
	
	@Autowired
	private IPruebaServiceEmpleado servicePrueba;
	
	@GetMapping("/empleado")
	public List<Empleado> buscarTodos(){
		return servicePrueba.buscarTodos();
	}
	
	@PostMapping("/empleado") 
	public Empleado guardar(@RequestBody Empleado empleado) {
		System.out.println("ingreso");
		servicePrueba.guardar(empleado);
		return empleado;
	}
	
	@PutMapping("/empleado")
	public Empleado modificar(@RequestBody Empleado empleado) {
		servicePrueba.guardar(empleado);
		return empleado;
	} 
	
	@DeleteMapping("/empleado/{id}")
	public String eliminar(@PathVariable("id") String id) {
		servicePrueba.eliminar(id);
		return "Registro Eliminado";
	}
}

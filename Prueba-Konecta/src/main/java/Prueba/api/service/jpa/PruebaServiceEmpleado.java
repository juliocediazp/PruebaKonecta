package Prueba.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prueba.api.entity.Empleado;
import Prueba.api.repository.PruebaRepositoryEmpleado;
import Prueba.api.service.IPruebaServiceEmpleado;

@Service
public class PruebaServiceEmpleado implements IPruebaServiceEmpleado {

	@Autowired
	private PruebaRepositoryEmpleado repoPrueba;
	
	public List<Empleado> buscarTodos() {
	
		
		
		return repoPrueba.findAll();
		
	
	}

	public void guardar(Empleado empleado) {
	
		
		if(empleado.getNombre() == null) {
			
		}
		repoPrueba.save(empleado);
	}

	public void eliminar(String id) {
		repoPrueba.deleteById(id);
	}

}

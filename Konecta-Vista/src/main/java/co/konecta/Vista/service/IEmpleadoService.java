package co.konecta.Vista.service;

import java.util.List;

import co.konecta.Vista.model.Empleado;

public interface IEmpleadoService {
	void insertar(Empleado empleado); 
	List<Empleado> buscarTodas();

	
}

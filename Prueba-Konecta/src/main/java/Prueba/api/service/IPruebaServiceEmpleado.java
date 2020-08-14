package Prueba.api.service;

import java.util.List;

import Prueba.api.entity.Empleado;

public interface IPruebaServiceEmpleado {

	List<Empleado> buscarTodos();
	void guardar(Empleado empleado);
	void eliminar(String id);
}

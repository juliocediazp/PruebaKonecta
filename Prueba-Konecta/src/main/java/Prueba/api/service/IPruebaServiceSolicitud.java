package Prueba.api.service;

import java.util.List;

import Prueba.api.entity.Empleado;
import Prueba.api.entity.Solucitud;

public interface IPruebaServiceSolicitud {
	
	List<Solucitud> buscarTodos();
	void guardar(Solucitud solicitud);
	void eliminar(String id);

}

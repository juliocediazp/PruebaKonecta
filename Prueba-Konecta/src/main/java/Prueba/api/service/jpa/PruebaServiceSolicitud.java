package Prueba.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Prueba.api.entity.Solucitud;
import Prueba.api.repository.PruebaRepositorySolicitud;
import Prueba.api.service.IPruebaServiceSolicitud;

@Service
public class PruebaServiceSolicitud implements IPruebaServiceSolicitud {

	
	@Autowired
	private PruebaRepositorySolicitud repoPrueba;
	
	@Override
	public List<Solucitud> buscarTodos() {
		
		return repoPrueba.findAll();
	}

	@Override
	public void guardar(Solucitud solicitud) {
		
		
		repoPrueba.save(solicitud);
	}

	@Override
	public void eliminar(String id) {
		
		
		repoPrueba.deleteById(id);
	}

}

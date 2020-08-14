package co.konecta.Vista.service;

import org.springframework.stereotype.Service;

import co.konecta.Vista.model.Solicitud;

@Service
public class SolicitudServiceImpl implements ISolicitudService {

	// Constructor vacio. 
	public SolicitudServiceImpl() {
		
	}
	

	public void guardar(Solicitud noticia) {
		System.out.println("Guadando el objeto " + noticia + " en la base de datos.");
	}
	
}

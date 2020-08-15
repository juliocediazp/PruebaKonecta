package co.konecta.Vista.service;

import java.util.ArrayList;
import java.util.List;

import co.konecta.Vista.model.Solicitud;
import co.konecta.Vista.util.solicitudUtil;

public interface ISolicitudService {

	void insertar(Solicitud solicitud); 
	ArrayList<Solicitud> buscarTodas();
	
}

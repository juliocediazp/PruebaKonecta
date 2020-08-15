package co.konecta.Vista.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import co.konecta.Vista.Consumo.solicitudConsumo;
import co.konecta.Vista.model.Solicitud;
import co.konecta.Vista.util.solicitudUtil;

@Service
public class SolicitudServiceImpl implements ISolicitudService {

	 solicitudConsumo consumo = new solicitudConsumo();
	 ArrayList<Solicitud> Soli = consumo.getSolicitud();
	 
	public SolicitudServiceImpl() {
		
	}

	public void insertar(Solicitud solicitud) {
		consumo.postSolicitud(solicitud);
		
	}

	public ArrayList<Solicitud> buscarTodas() {
		           
		return Soli;
	}
	

	
}

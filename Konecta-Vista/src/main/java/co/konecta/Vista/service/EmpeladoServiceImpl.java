package co.konecta.Vista.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.konecta.Vista.Consumo.EmpleadoConsumo;
import co.konecta.Vista.model.Empleado;

@Service
public class EmpeladoServiceImpl implements IEmpleadoService {

	 EmpleadoConsumo consumo = new EmpleadoConsumo();
	 ArrayList<Empleado> emplea = consumo.getEmpleado();
	
	public EmpeladoServiceImpl(){
				
	}
	
	

	public List<Empleado> buscarTodas() {
		return emplea;
	}



	public Empleado buscarPorId(int idEmpleado) {
		for (Empleado p : emplea){
//			if (p.getId() == idEmpleado){
//				return p;				
//			}
		}
		return null;
	}


	
	public void insertar(Empleado empleado) {
		//lista.add(empleado);
	}



	public List<String> buscarGeneros() {
		

				
		return null;
	}
	
}

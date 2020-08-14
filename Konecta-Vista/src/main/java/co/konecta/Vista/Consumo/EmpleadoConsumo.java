package co.konecta.Vista.Consumo;

import java.lang.reflect.Type;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import co.konecta.Vista.model.Empleado;

public class EmpleadoConsumo {
	
	
	public ArrayList<Empleado> getEmpleado() {
		
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<Empleado>>(){}.getType();
		
		
	try {	
     	Client cliente = ClientBuilder.newClient();
		String empleado = cliente.target("http://localhost:8080/api/empleado")
		.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
		System.out.println(empleado);
		
		ArrayList<Empleado> arrayDeJson = gson.fromJson(empleado, listType);
		

		
		
		 
	return arrayDeJson;
		 
	}catch(Exception e) {
		System.out.println("Error de Exception" + e);
		return null;
	}
		}

}

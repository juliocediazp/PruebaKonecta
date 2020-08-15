package co.konecta.Vista.Consumo;

import java.lang.reflect.Type;
import java.util.ArrayList;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import co.konecta.Vista.model.Empleado;
import co.konecta.Vista.model.Solicitud;

public class solicitudConsumo {

	private static final Type type = null;
	Gson gson = new Gson();
	Client cliente ;
	
	public ArrayList<Solicitud> getSolicitud() {

	try {	
     	
		Type listType = new TypeToken<ArrayList<Solicitud>>(){}.getType();
		
		cliente = ClientBuilder.newClient();
		String solicitud = cliente.target("http://localhost:8080/api/solicitud")
		.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
		System.out.println(solicitud);
		
		ArrayList<Solicitud> arrayDeJson = gson.fromJson(solicitud, listType);

	return arrayDeJson;
		 
	}catch(Exception e) {
		System.out.println("Error de Exception" + e);
		return null;
	}
		}
	public void postSolicitud(Solicitud solicitud){
		
		try {
			MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();
			 // String json = gson.toJson(solicitud,type);
			  formData.add("", solicitud.getCodigo());
			  formData.add("", solicitud.getDescripcion());
			  formData.add("", solicitud.getResumen());
			  formData.add("", solicitud.getId_empleado().getId());
			WebTarget webTarget = cliente.target("http://localhost:8080/api/empleado");
			Response response = webTarget.request().post(Entity.form(formData));	  
			
		} catch (Exception e) {
			System.out.println("Error de Exception" + e);
		}
		
		
	}
	
}

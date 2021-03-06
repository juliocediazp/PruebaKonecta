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

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.demo.jvmti.hprof.Tracker;

import co.konecta.Vista.model.Empleado;

public class EmpleadoConsumo {
	
	
	Gson gson = new Gson();
	Client cliente ;
	
	public ArrayList<Empleado> getEmpleado() {

	try {	
     	
		Type listType = new TypeToken<ArrayList<Empleado>>(){}.getType();
		
		cliente = ClientBuilder.newClient();
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
	
	public void postEmpleado(Empleado empleado){
		
		try {
			MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();
			 // String json = gson.toJson(empleado,type);
			  formData.add("01", empleado.getNombre());
			  formData.add("02", empleado.getFechaIngreso());
			  formData.add("03", empleado.getSalario());
			WebTarget webTarget = cliente.target("http://localhost:8080/api/empleado");
			Response response = webTarget.request().post(Entity.form(formData));
			
		
			
			
		
		} catch (Exception e) {
			System.out.println("Error de Exception" + e);
		}
		
		
	}

}

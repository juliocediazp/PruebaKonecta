package co.konecta.Vista.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.konecta.Vista.model.Empleado;
import co.konecta.Vista.service.IEmpleadoService;
import co.konecta.Vista.util.Utileria;

@Controller
public class HomeController {
	

	
	@Autowired
	private IEmpleadoService serviceEmpleado;
		
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	
		
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {

		
		return "empleado/listEmpleado";
	}

	
	
}

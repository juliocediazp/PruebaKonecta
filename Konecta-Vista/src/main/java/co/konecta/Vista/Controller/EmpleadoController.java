package co.konecta.Vista.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.konecta.Vista.model.Empleado;
import co.konecta.Vista.service.IEmpleadoService;
import co.konecta.Vista.util.Utileria;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService serviceEmpleado;

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Empleado> lista = serviceEmpleado.buscarTodas();
		model.addAttribute("empleado", lista);
		return "empleado/listEmpleado";
	}
	
	@GetMapping("/create")
	public String crear(@ModelAttribute Empleado empleado, Model model) {
		
		return "empleado/formEmpleado";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Empleado empleado, BindingResult result, RedirectAttributes attributes,
			HttpServletRequest request
			) {
		
		if (result.hasErrors()) {
			System.out.println("Existieron errores");
			return "empleado/formEmpleado";
		}

		serviceEmpleado.insertar(empleado);	
    	attributes.addFlashAttribute("mensaje", "El registro fue guardado");		
		return "redirect:/empleado/index";
	}	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
}

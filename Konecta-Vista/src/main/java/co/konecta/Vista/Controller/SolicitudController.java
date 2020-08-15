package co.konecta.Vista.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.konecta.Vista.model.Empleado;
import co.konecta.Vista.model.Solicitud;
import co.konecta.Vista.service.ISolicitudService;

@Controller
@RequestMapping("/solicitud")
public class SolicitudController {
	
	@Autowired
	private ISolicitudService serviceSolicitud;

	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Solicitud> lista = serviceSolicitud.buscarTodas();
		model.addAttribute("solicitud", lista);
		return "Solicitudes/solicitudesList";
	}
	
	@GetMapping("/create")
	public String crear(@ModelAttribute Solicitud solicitud, Model model) {
		
		return "Solicitudes/formSolicitudes";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Solicitud solicitud, BindingResult result, RedirectAttributes attributes,
			HttpServletRequest request
			) {
		
		if (result.hasErrors()) {
			//System.out.println("Existieron errores");
			return "Solicitudes/formSolicitudes";
		}

		serviceSolicitud.insertar(solicitud);	
    	attributes.addFlashAttribute("mensaje", "El registro fue guardado");		
		return "redirect:/Solicitudes/index";
	}	
	
	
}

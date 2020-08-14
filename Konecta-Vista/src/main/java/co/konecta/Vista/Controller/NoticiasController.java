package co.konecta.Vista.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.konecta.Vista.model.Solicitud;
import co.konecta.Vista.service.ISolicitudService;

@Controller
@RequestMapping("/noticias")
public class NoticiasController {
	
	@Autowired
	private ISolicitudService serviceNoticias;

	@GetMapping(value="/create")
	public String crear(){
		return "noticias/formNoticia";
	}
	
	@PostMapping(value="/save")
	public String guardar(Solicitud noticia){
				
		// Pendiente: Guardar el objeto noticia en la BD		
		
		serviceNoticias.guardar(noticia);
		
		return "noticias/formNoticia";
	}
}

package col.com.gm.web;

import col.com.gm.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    //@Value("${index.saludo}")
    //private String saludo;
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var personas = personaService.listarPersonas();
        
        //var mensaje = "Hola Todos desde el controlador";
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
        
        //var personas = Arrays.asList(persona, persona2);
        
        //var personas = new ArrayList();
        
        log.info("Ejecutando y mostrando log");
        //model.addAttribute("mensaje", mensaje);
        //model.addAttribute("saludo",saludo);
        
//        model.addAttribute("persona", persona);
        
        model.addAttribute("personas", personas);
        
        
        
        return "index";
    }
}

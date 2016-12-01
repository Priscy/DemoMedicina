/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.demomedicina.web;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import mx.edu.um.fit.demomedicina.config.Constants;
import mx.edu.um.fit.demomedicina.model.Pregunta;
import org.springframework.ui.Model;
import mx.edu.um.fit.demomedicina.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Priscila
 */

@Controller
@RequestMapping("/pregunta")
public class PreguntaController extends BaseController{
    
    @Autowired 
    private PreguntaService preguntaService;
    
    @RequestMapping("/new")
    public String newPregunta(Model model){
        log.debug("Nueva Pregunta..");
        Pregunta pregunta = new Pregunta();
        
        model.addAttribute(Constants.Pregunta_UI,pregunta);
        
        return "/pregunta/new";
    }
    
     @RequestMapping("/create")
     public String create(HttpServletRequest request, @Valid Pregunta pregunta, BindingResult bindingResult, Errors errors, Model model, RedirectAttributes redirectAttributes) {
         if (bindingResult.hasErrors()) {
            log.error("Error detected in user form...");
            model.addAttribute(Constants.Pregunta_UI, pregunta);
            return "/pregunta/new";
        }
         Pregunta p = preguntaService.save(pregunta);
         redirectAttributes.addFlashAttribute(Constants.MESSAGE_UI, "La pregunta <b> '"+ pregunta.getText()+ "' </b> ha sido creada safisfactoriamente");
         redirectAttributes.addFlashAttribute(Constants.MESSAGE_ATTRS_UI, new String[]{pregunta.getText()});
         return "redirect:/pregunta/list";

     }
     
     @RequestMapping("/list")
     public String list(Model model) {
        List<Pregunta> list = preguntaService.getAll();

        model.addAttribute(Constants.Pregunta_LIST_UI, list);

        return "/pregunta/list";
     }
 
    
}

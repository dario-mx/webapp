package com.webapp.controller;

import com.webapp.model.Persona;
import com.webapp.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
  
  @Autowired
  private IPersonaRepo repo;
  
  @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Persona persona= new Persona();
    persona.setIdPersona(1);
    persona.setNombre("CODE");
    repo.save(persona);
    
    model.addAttribute("name", name);
		return "greeting";
	}
  
  @GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("personas", repo.findAll());
    return "greeting";
	}
}

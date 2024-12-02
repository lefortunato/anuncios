package com.anuncio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anuncio.model.Anuncio;
import com.anuncio.service.AnuncioService;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/anuncios")
public class AnuncioController {
    @Autowired
    private AnuncioService anuncioService;

    @GetMapping
    public String listarAnuncios(Model model) {
        model.addAttribute("anuncios", anuncioService.listarAnuncios());
        return "anuncio/lista";
    }

    @GetMapping("/novo")
    public String novoAnuncio(Model model) {
        model.addAttribute("anuncio", new Anuncio());
        return "anuncio/form";
    }

    @PostMapping("/salvar")
    public String salvarAnuncio(@ModelAttribute Anuncio anuncio) {
        anuncioService.salvarAnuncio(anuncio);
        return "redirect:/anuncios";
    }
}

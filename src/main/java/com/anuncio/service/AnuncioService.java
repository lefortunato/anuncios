package com.anuncio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuncio.model.Anuncio;
import com.anuncio.repository.AnuncioRepository;

@Service
public class AnuncioService {
    @Autowired
    private AnuncioRepository anuncioRepository;

    public void salvarAnuncio(Anuncio anuncio) {
        anuncioRepository.save(anuncio);
    }

    public List<Anuncio> listarAnuncios() {
        return anuncioRepository.findAll();
    }
}

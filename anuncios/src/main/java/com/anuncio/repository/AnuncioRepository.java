package com.anuncio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuncio.model.Anuncio;
import com.anuncio.model.User;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
    List<Anuncio> findByUser(User user);
}

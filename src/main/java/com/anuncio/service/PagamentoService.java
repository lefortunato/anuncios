package com.anuncio.service;

import org.springframework.stereotype.Service;

import com.anuncio.model.Anuncio;

@Service
public class PagamentoService {
    // Lógica para processar o pagamento (via Stripe ou outro)
    public void processarPagamento(Anuncio anuncio, double valor) {
        // Aqui você integraria a API de pagamento (como Stripe ou PagSeguro)
    }
}

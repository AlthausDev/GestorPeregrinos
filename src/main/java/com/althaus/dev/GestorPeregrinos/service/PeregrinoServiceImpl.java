package com.althaus.dev.GestorPeregrinos.service;

import com.althaus.dev.GestorPeregrinos.model.Peregrino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PeregrinoServiceImpl extends CoreServiceImpl <Peregrino>{
    /**
     * Constructor para la inicialización de la implementación del servicio central.
     *
     * @param repository El repositorio JPA utilizado para acceder a la capa de persistencia.
     */
    public PeregrinoServiceImpl(JpaRepository<Peregrino, Long> repository) {
        super(repository);
    }
}

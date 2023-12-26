package com.althaus.dev.GestorPeregrinos.service;

import com.althaus.dev.GestorPeregrinos.model.Carnet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CarnetServiceImpl extends CoreServiceImpl<Carnet>{

    /**
     * Constructor para la inicialización de la implementación del servicio central.
     *
     * @param repository El repositorio JPA utilizado para acceder a la capa de persistencia.
     */
    public CarnetServiceImpl(JpaRepository <Carnet, Long> repository) {
        super(repository);
    }
}

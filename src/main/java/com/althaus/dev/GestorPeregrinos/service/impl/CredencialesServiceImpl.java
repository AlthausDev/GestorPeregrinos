package com.althaus.dev.GestorPeregrinos.service.impl;

import com.althaus.dev.GestorPeregrinos.model.Credenciales;
import com.althaus.dev.GestorPeregrinos.repository.CredencialesRepository;
import com.althaus.dev.GestorPeregrinos.service.CredencialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredencialesServiceImpl extends CoreServiceImpl<Credenciales> implements CredencialesService {

    @Autowired
    public CredencialesServiceImpl(CredencialesRepository credencialesRepository) {
        super(credencialesRepository);
    }
}


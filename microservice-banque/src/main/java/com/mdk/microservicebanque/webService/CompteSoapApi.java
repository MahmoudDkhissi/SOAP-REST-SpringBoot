package com.mdk.microservicebanque.webService;


import com.mdk.microservicebanque.entities.Compte;
import com.mdk.microservicebanque.repositories.CompteRepository;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;


@Component
@WebService
public class CompteSoapApi {

    CompteRepository compteRepository;

    public CompteSoapApi(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }


    @WebMethod
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "id") Long id) {
        return compteRepository.getCompteById(id);
    }
}

package com.mdk.microservicebanque.webService;


import com.mdk.microservicebanque.entities.Compte;
import com.mdk.microservicebanque.repositories.CompteRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/banque")
public class CompteRestJaxRsApi {

    CompteRepository compteRepository;

    public CompteRestJaxRsApi(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @GET
    @Path("/comptes")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @GET
    @Path("/comptes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getCompte(@PathParam("id") Long id) {
        return compteRepository.getCompteById(id);
    }

    @POST
    @Path("/comptes")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte save(Compte compte) {
        return compteRepository.save(compte);
    }

    @PUT
    @Path("/comptes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte UPDATE(Compte nouveauCompte, @PathParam("id") Long id) {
        nouveauCompte.setId(id);
        return compteRepository.save(nouveauCompte);
    }

    @DELETE
    @Path("/comptes/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id) {
        compteRepository.deleteById(id);
    }
}

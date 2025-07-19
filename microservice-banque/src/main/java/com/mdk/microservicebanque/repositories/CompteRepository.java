package com.mdk.microservicebanque.repositories;

import com.mdk.microservicebanque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {

    Compte getCompteById(Long id);
}

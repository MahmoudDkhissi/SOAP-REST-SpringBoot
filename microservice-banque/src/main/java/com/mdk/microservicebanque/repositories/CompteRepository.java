package com.mdk.microservicebanque.repositories;

import com.mdk.microservicebanque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}

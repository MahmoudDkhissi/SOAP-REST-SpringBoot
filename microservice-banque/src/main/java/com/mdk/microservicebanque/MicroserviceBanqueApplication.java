package com.mdk.microservicebanque;

import com.mdk.microservicebanque.entities.Compte;
import com.mdk.microservicebanque.entities.TypeCompte;
import com.mdk.microservicebanque.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MicroserviceBanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBanqueApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null,Math.random()*9000,new Date(), TypeCompte.EPARGNE));
			compteRepository.findAll().forEach(compte ->  System.out.println(compte.toString()));
		};
	}

}

package com.mdk.microservicebanque.webService;


import com.mdk.microservicebanque.entities.Compte;
import com.mdk.microservicebanque.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/banque")
public class CompteRestControllerApi {

    CompteRepository compteRepository;

    public CompteRestControllerApi(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }


    @GetMapping(path = "/comptes")
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @GetMapping("/comptes/{id}")
    public Compte getCompte(@PathVariable Long id) {
        return compteRepository.getCompteById(id);
    }


    @PostMapping("/comptes")
    public Compte save(@RequestBody Compte compte) {
        return compteRepository.save(compte);
    }


    @PutMapping("/comptes/{id}")
    public Compte update(@RequestBody Compte nouveauCompte, @PathVariable Long id) {
        nouveauCompte.setId(id);
        return compteRepository.save(nouveauCompte);
    }

    @DeleteMapping("/comptes/{id}")
    public void delete(@PathVariable Long id) {
        compteRepository.deleteById(id);
    }
}

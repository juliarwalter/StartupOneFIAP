package br.com.fiap.StartupOneFIAP.controller;

import br.com.fiap.StartupOneFIAP.model.Institution;
import br.com.fiap.StartupOneFIAP.repository.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/company")
public class InstitutionResource {
    @Autowired
    private InstitutionRepository institutionRepository;

    @GetMapping
    public List<Institution> listCompanies() { return institutionRepository.findAll(); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Institution registerCompanies(@RequestBody Institution institution) {
        return institutionRepository.save(institution);
    }
    @DeleteMapping("{idInstitution}")
    public void deleteCompany(@PathVariable int idInstitution) {
        institutionRepository.deleteById(idInstitution);
    }

    @PutMapping("{idInstitution}")
    public Institution UpdateCompany(@RequestBody Institution institution, @PathVariable int idInstitution) {
        institution.setIdInstitution(idInstitution);
        return institutionRepository.save(institution);
    }
}

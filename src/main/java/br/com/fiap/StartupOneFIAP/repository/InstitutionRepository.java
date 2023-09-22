package br.com.fiap.StartupOneFIAP.repository;

import br.com.fiap.StartupOneFIAP.model.Institution;
import br.com.fiap.StartupOneFIAP.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Integer> {

}

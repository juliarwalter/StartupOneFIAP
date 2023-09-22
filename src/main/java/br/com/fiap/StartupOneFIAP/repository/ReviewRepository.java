package br.com.fiap.StartupOneFIAP.repository;

import br.com.fiap.StartupOneFIAP.model.Review;
import br.com.fiap.StartupOneFIAP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}

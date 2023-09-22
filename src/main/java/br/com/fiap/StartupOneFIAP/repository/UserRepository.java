package br.com.fiap.StartupOneFIAP.repository;

import br.com.fiap.StartupOneFIAP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findById(String id);
    List<User> findByName(String name);
    List<User> findByEmail(String email);

}

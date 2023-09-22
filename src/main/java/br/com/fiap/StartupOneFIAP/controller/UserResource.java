package br.com.fiap.StartupOneFIAP.controller;

import br.com.fiap.StartupOneFIAP.model.User;
import br.com.fiap.StartupOneFIAP.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listUsers() { return userRepository.findAll(); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User registerUser(@RequestBody User user) { return userRepository.save(user); }

    @DeleteMapping("{idUser}")
    public void deleteUser(@PathVariable int idUser) {
        userRepository.deleteById(idUser);
    }

    @PutMapping("{idUser}")
    public User UpdateUser(@RequestBody User user, @PathVariable int idUser) {
        user.setIdUser(idUser);
        return userRepository.save(user);
    }
}

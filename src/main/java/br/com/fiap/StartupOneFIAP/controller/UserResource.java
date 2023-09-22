package br.com.fiap.StartupOneFIAP.controller;

import br.com.fiap.StartupOneFIAP.model.User;
import br.com.fiap.StartupOneFIAP.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ususario")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listUsers() {return userRepository.findAll();}
}

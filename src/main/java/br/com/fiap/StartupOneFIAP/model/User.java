package br.com.fiap.StartupOneFIAP.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.validation.constraints.NotBlank;

import java.util.Calendar;

@Entity
@Table(name = "T_SIP_USUARIO")
@SequenceGenerator(name = "usuario",sequenceName = "sq_tb_usuario", allocationSize = 1)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    @Column(name = "id_usuario")
    private int id;

    @Column(name = "nm_usuario", nullable = true, length = 100)
    @NotBlank(message = "Nome é um campo obrigatório")
    private String name;

    @Column(name = "nm_sobrenome", nullable = true, length = 100)
    private String lastname;

    @Column(name = "nm_email", nullable = true, length = 100)
    private String email;

    @Column(name = "dt_nascimento")
    @CreationTimestamp
    private Calendar birthday;

    @Column(name = "dt_cadastro")
    @CreationTimestamp
    private Calendar registrationDate;

    @Column(name = "dt_ultimoAcesso")
    @CreationTimestamp
    private Calendar lastRegstration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getLastName() {
        return name;
    }

    public void setLastName(String lastname) { this.lastname = lastname; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Calendar getLastRegistration() {
        return lastRegstration;
    }

    public void setLastRegistration(Calendar lastRegistration) {
        this.lastRegstration = lastRegstration;
    }

}

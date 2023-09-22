package br.com.fiap.StartupOneFIAP.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Calendar;
@Entity
@Table(name = "T_SIP_AVALICAO")
@SequenceGenerator(name = "avaliacao",sequenceName = "sq_tb_avaliacao", allocationSize = 1)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "avaliacao")
    @Column(name = "id_avaliacao")
    private int id;

    @Column(name = "nr_estrelas", nullable = true, length = 100)
    @NotBlank(message = "Número de estrelas é obrigatório")
    private int stars;

    @Column(name = "tx_comentario", nullable = true, length = 100)
    private String comments;

    @Column(name = "dt_avaliacao")
    @CreationTimestamp
    private Calendar reviewDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Calendar getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Calendar reviewDate) {
        this.reviewDate = reviewDate;
    }
}

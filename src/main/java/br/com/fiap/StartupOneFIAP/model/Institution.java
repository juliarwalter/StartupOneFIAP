package br.com.fiap.StartupOneFIAP.model;

import jakarta.persistence.*;

@Entity
@Table(name = "T_SIP_ESTABELECIMENTO")
@SequenceGenerator(name = "estabelecimento",sequenceName = "sq_tb_estabelecimento", allocationSize = 1)
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    @Column(name = "id_estabelecimento")
    private int idInstitution;

    @Column(name = "id_avaliacao")
    private int idReview;

    @Column(name = "nm_instituicao")
    private String companyName;

    @Column(name = "tp_estabelecimento")
    private String companyType;

    @Column(name = "nr_acessibilidade")
    private String acessibilityRate;

    public int getIdInstitution() {
        return idInstitution;
    }

    public void setIdInstitution(int idInstitution) {
        this.idInstitution = idInstitution;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getAcessibilityRate() {
        return acessibilityRate;
    }

    public void setAcessibilityRate(String acessibilityRate) {
        this.acessibilityRate = acessibilityRate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

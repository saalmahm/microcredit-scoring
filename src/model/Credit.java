package model;

import java.time.LocalDateTime;

public class Credit {
    private Integer id;
    private LocalDateTime dateCredit;
    private Double montantDemande;
    private Double montantOctroye;
    private Double tauxInteret;
    private Integer dureeEnMois;
    private String typeCredit;
    private Decision decision;
    private Integer personId;

    public Credit() {}

    public Credit(Integer id, LocalDateTime dateCredit, Double montantDemande, Double montantOctroye,
                  Double tauxInteret, Integer dureeEnMois, String typeCredit,
                  Decision decision, Integer personId) {
        this.id = id;
        this.dateCredit = dateCredit;
        this.montantDemande = montantDemande;
        this.montantOctroye = montantOctroye;
        this.tauxInteret = tauxInteret;
        this.dureeEnMois = dureeEnMois;
        this.typeCredit = typeCredit;
        this.decision = decision;
        this.personId = personId;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public LocalDateTime getDateCredit() { return dateCredit; }
    public void setDateCredit(LocalDateTime dateCredit) { this.dateCredit = dateCredit; }

    public Double getMontantDemande() { return montantDemande; }
    public void setMontantDemande(Double montantDemande) { this.montantDemande = montantDemande; }

    public Double getMontantOctroye() { return montantOctroye; }
    public void setMontantOctroye(Double montantOctroye) { this.montantOctroye = montantOctroye; }

    public Double getTauxInteret() { return tauxInteret; }
    public void setTauxInteret(Double tauxInteret) { this.tauxInteret = tauxInteret; }

    public Integer getDureeEnMois() { return dureeEnMois; }
    public void setDureeEnMois(Integer dureeEnMois) { this.dureeEnMois = dureeEnMois; }

    public String getTypeCredit() { return typeCredit; }
    public void setTypeCredit(String typeCredit) { this.typeCredit = typeCredit; }

    public Decision getDecision() { return decision; }
    public void setDecision(Decision decision) { this.decision = decision; }

    public Integer getPersonId() { return personId; }
    public void setPersonId(Integer personId) { this.personId = personId; }
}

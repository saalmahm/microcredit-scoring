package model;

import java.time.LocalDate;

public class Personne {
    protected Integer id;
    protected String nom;
    protected String prenom;
    protected LocalDate dateNaissance;
    protected String ville;
    protected Integer nombreEnfants;
    protected Double investissement;
    protected Double placement;
    protected String situationFamiliale; // simple String to keep it minimal
    protected LocalDate createdAt; // date part (DB stores timestamp)
    protected Double score;

    public Personne() {}

    public Personne(Integer id, String nom, String prenom, LocalDate dateNaissance, String ville,
                    Integer nombreEnfants, Double investissement, Double placement,
                    String situationFamiliale, LocalDate createdAt, Double score) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
        this.nombreEnfants = nombreEnfants;
        this.investissement = investissement;
        this.placement = placement;
        this.situationFamiliale = situationFamiliale;
        this.createdAt = createdAt;
        this.score = score;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }

    public Integer getNombreEnfants() { return nombreEnfants; }
    public void setNombreEnfants(Integer nombreEnfants) { this.nombreEnfants = nombreEnfants; }

    public Double getInvestissement() { return investissement; }
    public void setInvestissement(Double investissement) { this.investissement = investissement; }

    public Double getPlacement() { return placement; }
    public void setPlacement(Double placement) { this.placement = placement; }

    public String getSituationFamiliale() { return situationFamiliale; }
    public void setSituationFamiliale(String situationFamiliale) { this.situationFamiliale = situationFamiliale; }

    public LocalDate getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDate createdAt) { this.createdAt = createdAt; }

    public Double getScore() { return score; }
    public void setScore(Double score) { this.score = score; }
}

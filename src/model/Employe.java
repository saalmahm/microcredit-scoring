package model;

public class Employe extends Personne {
    private Double salaire;
    private Integer anciennete;
    private String poste;
    private String typeContrat;
    private Secteur secteur;

    public Employe() {}

    public Employe(Double salaire, Integer anciennete, String poste, String typeContrat, Secteur secteur) {
        this.salaire = salaire;
        this.anciennete = anciennete;
        this.poste = poste;
        this.typeContrat = typeContrat;
        this.secteur = secteur;
    }

    public Double getSalaire() { return salaire; }
    public void setSalaire(Double salaire) { this.salaire = salaire; }

    public Integer getAnciennete() { return anciennete; }
    public void setAnciennete(Integer anciennete) { this.anciennete = anciennete; }

    public String getPoste() { return poste; }
    public void setPoste(String poste) { this.poste = poste; }

    public String getTypeContrat() { return typeContrat; }
    public void setTypeContrat(String typeContrat) { this.typeContrat = typeContrat; }

    public Secteur getSecteur() { return secteur; }
    public void setSecteur(Secteur secteur) { this.secteur = secteur; }
}

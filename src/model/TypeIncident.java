package model;

public enum TypeIncident {
    PAYE_A_TEMPS("Payé à Temps", 3),
    EN_RETARD("En Retard", 0),
    PAYE_EN_RETARD("Payé en Retard", 3),
    IMPAYE_NON_REGLE("Impayé Non Réglé", -10),
    IMPAYE_REGLE("Impayé Réglé", 5);

    private String libelle;
    private int impactScore;

    TypeIncident(String libelle, int impactScore) {
        this.libelle = libelle;
        this.impactScore = impactScore;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getImpactScore() {
        return impactScore;
    }
}
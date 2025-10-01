package model;

public enum StatusPaiment {
    PAYE_A_TEMPS("Payé à Temps", 3),
    EN_RETARD("En Retard", 0),
    PAYE_EN_RETARD("Payé en Retard", 3),
    IMPAYE_NON_REGLE("Impayé Non Réglé", -10),
    IMPAYE_REGLE("Impayé Réglé", 5);

    private String libelle;
    private int impactScore;

    StatusPaiment(String libelle, int impactScore) {
        this.libelle = libelle;
        this.impactScore = impactScore;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getImpactScore() {
        return impactScore;
    }

    public static StatusPaiment fromString(String text) {
        for (StatusPaiment s : StatusPaiment.values()) {
            if (s.name().equalsIgnoreCase(text) || s.getLibelle().equalsIgnoreCase(text)) {
                return s;
            }
        }
        return null;
    }

}

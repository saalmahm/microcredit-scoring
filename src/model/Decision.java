package model;

public enum Decision {
    ACCORDIMMEDIAT("Accord Immédiat"),
    ETUDEMANUELLE("Étude Manuelle"),
    REFUS_AUTOMATIQUE("Refus Automatique");

    private String libelle;

    Decision(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
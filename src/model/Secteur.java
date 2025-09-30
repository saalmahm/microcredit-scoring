package model;

public enum Secteur {
    PUBLIC("Public", 25),
    GRANDE_ENTREPRISE("Grande Entreprise", 15),
    PME("PME", 12);

    private String libelle;
    private int scoreBase;

    Secteur(String libelle, int scoreBase) {
        this.libelle = libelle;
        this.scoreBase = scoreBase;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getScoreBase() {
        return scoreBase;
    }

    public String getValue() {
        return this.name().toLowerCase();
    }

    public static Secteur fromString(String text) {
        for (Secteur s : Secteur.values()) {
            if (s.name().equalsIgnoreCase(text) ||
                    s.getValue().equalsIgnoreCase(text) ||
                    s.libelle.equalsIgnoreCase(text)) {
                return s;
            }
        }
        return null;
    }
}
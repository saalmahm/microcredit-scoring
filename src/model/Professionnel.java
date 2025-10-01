package model;

public class Professionnel extends Personne {
    private Double revenu;
    private String immatriculationFiscale;
    private Secteur secteurActivite;
    private String activite;

    public Professionnel() {}

    public Professionnel(Double revenu, String immatriculationFiscale,
                         Secteur secteurActivite, String activite) {
        this.revenu = revenu;
        this.immatriculationFiscale = immatriculationFiscale;
        this.secteurActivite = secteurActivite;
        this.activite = activite;
    }

    // getters & setters
}

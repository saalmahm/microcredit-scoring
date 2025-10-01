package model;

import java.time.LocalDate;

public class Echeance {
    private Integer id;
    private LocalDate dateEcheance;
    private Double mensualite;
    private LocalDate datePaiement;
    private StatusPaiment statutPaiement;

    public Echeance() {}

    public Echeance(Integer id, LocalDate dateEcheance, Double mensualite,
                    LocalDate datePaiement, StatusPaiment statutPaiement) {
        this.id = id;
        this.dateEcheance = dateEcheance;
        this.mensualite = mensualite;
        this.datePaiement = datePaiement;
        this.statutPaiement = statutPaiement;
    }

    // getters & setters
}

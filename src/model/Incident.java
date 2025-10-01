package model;

import java.time.LocalDate;

public class Incident {
    private Integer id;
    private LocalDate dateIncident;
    private Echeance echeance;
    private Double scoreImpact;
    private TypeIncident typeIncident;

    public Incident() {}

    public Incident(Integer id, LocalDate dateIncident, Echeance echeance,
                    Double scoreImpact, TypeIncident typeIncident) {
        this.id = id;
        this.dateIncident = dateIncident;
        this.echeance = echeance;
        this.scoreImpact = scoreImpact;
        this.typeIncident = typeIncident;
    }

    // getters & setters
}

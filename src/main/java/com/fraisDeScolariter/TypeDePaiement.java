package com.fraisDeScolariter;

import java.time.Instant;

public class TypeDePaiement {

    private int id;
    private float montant;
    private Instant dateEtHeurePaiement;

    public TypeDePaiement(int id, float montant, Instant dateEtHeurePaiement) {
        this.id = id;
        this.montant = montant;
        this.dateEtHeurePaiement = dateEtHeurePaiement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public Instant getDateEtHeurePaiement() {
        return dateEtHeurePaiement;
    }

    public void setDateEtHeurePaiement(Instant dateEtHeurePaiement) {
        this.dateEtHeurePaiement = dateEtHeurePaiement;
    }
}

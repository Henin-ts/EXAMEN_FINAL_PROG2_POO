package com.fraisDeScolariter;

import java.time.LocalDate;
import java.util.List;

public class Frais {
    private int id;
    private String label;
    private float montantPayer;
    private LocalDate deadline;

    public Frais(int id, String label, float montantPayer, LocalDate deadline) {
        this.id = id;
        this.label = label;
        this.montantPayer = montantPayer;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(float montantPayer) {
        this.montantPayer = montantPayer;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public StatusFrais getStatut(List<TypeDePaiement> paiements , LocalDate dateAujourdhui){
        float totalPaye = 0 ;

        for (TypeDePaiement p: paiements) {
            totalPaye += p.getMontant();
        }

        if (totalPaye == montantPayer){
            return StatusFrais.PAID;
        }

        if (totalPaye > montantPayer){
            return StatusFrais.OVERPAID;
        }

        if (dateAujourdhui.isAfter(deadline) && totalPaye < montantPayer) {
            return StatusFrais.LATE;
        }

        else {
            return StatusFrais.IN_PROGRESS;
        }
    }
}

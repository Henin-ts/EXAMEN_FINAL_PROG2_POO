package com.fraisDeScolariter;

import java.time.LocalDate;
import java.util.List;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateEntrer;
    private List<String> historiqueGroupes;
    private List<Frais> frais;
    private List<TypeDePaiement> paiements;

    public Etudiant(int id, String nom, String prenom, LocalDate dateEntrer, List<String> historiqueGroupes, List<Frais> frais, List<TypeDePaiement> paiements) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntrer = dateEntrer;
        this.historiqueGroupes = historiqueGroupes;
        this.frais = frais;
        this.paiements = paiements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateEntrer() {
        return dateEntrer;
    }

    public void setDateEntrer(LocalDate dateEntrer) {
        this.dateEntrer = dateEntrer;
    }

    public List<String> getHistoriqueGroupes() {
        return historiqueGroupes;
    }

    public void setHistoriqueGroupes(List<String> historiqueGroupes) {
        this.historiqueGroupes = historiqueGroupes;
    }

    public List<Frais> getFrais() {
        return frais;
    }

    public void setFrais(List<Frais> frais) {
        this.frais = frais;
    }

    public List<TypeDePaiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<TypeDePaiement> paiements) {
        this.paiements = paiements;
    }
}

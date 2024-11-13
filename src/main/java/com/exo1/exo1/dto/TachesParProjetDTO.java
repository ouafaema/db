package com.exo1.exo1.dto;

public class TachesParProjetDTO {
    private Long projetId;
    private String projetNom;
    private Long nombreTaches;

    public TachesParProjetDTO() {
    }

    public TachesParProjetDTO(Long projetId, String projetNom, Long nombreTaches) {
        this.projetId = projetId;
        this.projetNom = projetNom;
        this.nombreTaches = nombreTaches;
    }

    public Long getProjetId() {
        return projetId;
    }

    public void setProjetId(Long projetId) {
        this.projetId = projetId;
    }

    public String getProjetNom() {
        return projetNom;
    }

    public void setProjetNom(String projetNom) {
        this.projetNom = projetNom;
    }

    public Long getNombreTaches() {
        return nombreTaches;
    }

    public void setNombreTaches(Long nombreTaches) {
        this.nombreTaches = nombreTaches;
    }

    @Override
    public String toString() {
        return "TachesParProjetDTO{" +
                "projetId=" + projetId +
                ", projetNom='" + projetNom + '\'' +
                ", nombreTaches=" + nombreTaches +
                '}';
    }
}

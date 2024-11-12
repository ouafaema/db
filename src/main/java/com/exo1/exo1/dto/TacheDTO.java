package com.exo1.exo1.dto;

import lombok.Data;

@Data
public class TacheDTO {
    private Long id;
    private String titre;
    private String statut;
    private Long projetId;
    private Long utilisateurId;
}

package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "projet_id")
    private Projet projet;

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}

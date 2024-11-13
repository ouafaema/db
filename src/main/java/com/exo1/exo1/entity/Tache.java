package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.Data;

//on filtre fréquemment les tâches par projet
@Entity
@Data
@Table(name = "tache", indexes = {
        @Index(name = "idx_tache_projet_id", columnList = "projet_id")
})
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projet_id")
    private Projet projet;

    @OneToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}

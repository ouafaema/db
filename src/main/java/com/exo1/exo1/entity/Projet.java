package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

// index sur la colonne nom
@Entity
@Data
@Table(name = "projet", indexes = {
        @Index(name = "idx_projet_nom", columnList = "nom")
})
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "utilisateur_projet",
            joinColumns = @JoinColumn(name = "projet_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateur> utilisateurs;

    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<Tache> taches;
}

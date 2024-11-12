package com.exo1.exo1.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Column(unique = true)
    private String email;

    @ManyToMany(mappedBy = "utilisateurs")
    private List<Projet> projets;

    @OneToOne(mappedBy = "utilisateur")
    private Tache tache;
}
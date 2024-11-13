package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    @EntityGraph(attributePaths = {"projets"})
    @Query("SELECT u FROM Utilisateur u")
    List<Utilisateur> findAllWithProjets();
}

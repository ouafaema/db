package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @EntityGraph(attributePaths = {"taches"})
    List<Projet> findAllWithTaches();
}

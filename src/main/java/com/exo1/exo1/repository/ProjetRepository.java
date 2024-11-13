package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjetRepository extends JpaRepository<Projet, Long> {


    /*@EntityGraph(attributePaths = {"taches"})
    @Query("SELECT p FROM Projet p")
    List<Projet> findAllWithTaches();*/


    @EntityGraph(attributePaths = {"taches"})
    @Query("SELECT p FROM Projet p")
    Page<Projet> findAllWithTaches(Pageable pageable);
}

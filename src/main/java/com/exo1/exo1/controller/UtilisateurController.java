package com.exo1.exo1.controller;

import com.exo1.exo1.dto.UtilisateurDTO;
import com.exo1.exo1.service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/api/utilisateurs")
@AllArgsConstructor
public class UtilisateurController {

    private UtilisateurService utilisateurService;

   /* @GetMapping
    public List<UtilisateurDTO> getAllUtilisateursWithProjets() {
        return utilisateurService.getAllUtilisateursWithProjets();
    }*/

    @GetMapping(("/pagination"))
    public Page<UtilisateurDTO> getAllUtilisateursWithProjets(Pageable pageable) {
        return utilisateurService.getAllUtilisateursWithProjets(pageable);
    }

    @GetMapping("/{id}")
    public UtilisateurDTO getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    @PostMapping
    public UtilisateurDTO createUtilisateur(@RequestBody UtilisateurDTO utilisateurDTO) {
        return utilisateurService.createUtilisateur(utilisateurDTO);
    }

    @PutMapping("/{id}")
    public UtilisateurDTO updateUtilisateur(@PathVariable Long id, @RequestBody UtilisateurDTO utilisateurDTO) {
        return utilisateurService.updateUtilisateur(id, utilisateurDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteUtilisateur(id);
    }
}

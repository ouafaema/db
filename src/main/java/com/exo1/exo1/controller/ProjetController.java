package com.exo1.exo1.controller;

import com.exo1.exo1.dto.ProjetDTO;
import com.exo1.exo1.service.ProjetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projets")
public class ProjetController {

    private final ProjetService projetService;

    public ProjetController(ProjetService projetService) {
        this.projetService = projetService;
    }

    @GetMapping
    public List<ProjetDTO> getAllProjetsWithTaches() {
        return projetService.getAllProjetsWithTaches();
    }

    @GetMapping("/{id}")
    public ProjetDTO getProjetById(@PathVariable Long id) {
        return projetService.getProjetById(id);
    }

    @PostMapping
    public ProjetDTO createProjet(@RequestBody ProjetDTO projetDTO) {
        return projetService.createProjet(projetDTO);
    }

    @PutMapping("/{id}")
    public ProjetDTO updateProjet(@PathVariable Long id, @RequestBody ProjetDTO projetDTO) {
        return projetService.updateProjet(id, projetDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable Long id) {
        projetService.deleteProjet(id);
    }
}

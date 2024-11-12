package com.exo1.exo1.controller;

import com.exo1.exo1.dto.TacheDTO;
import com.exo1.exo1.service.TacheService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taches")
public class TacheController {

    private final TacheService tacheService;

    public TacheController(TacheService tacheService) {
        this.tacheService = tacheService;
    }

    @GetMapping
    public List<TacheDTO> getAllTaches() {
        return tacheService.getAllTaches();
    }

    @GetMapping("/{id}")
    public TacheDTO getTacheById(@PathVariable Long id) {
        return tacheService.getTacheById(id);
    }

    @PostMapping
    public TacheDTO createTache(@RequestBody TacheDTO tacheDTO) {
        return tacheService.createTache(tacheDTO);
    }

    @PutMapping("/{id}")
    public TacheDTO updateTache(@PathVariable Long id, @RequestBody TacheDTO tacheDTO) {
        return tacheService.updateTache(id, tacheDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTache(@PathVariable Long id) {
        tacheService.deleteTache(id);
    }
}

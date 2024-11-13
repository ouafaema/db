package com.exo1.exo1.controller;

import com.exo1.exo1.dto.TachesParProjetDTO;
import com.exo1.exo1.service.TachesParProjetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projets")
public class TachesParProjetController {

    private final TachesParProjetService service;

    public TachesParProjetController(TachesParProjetService service) {
        this.service = service;
    }


    @GetMapping("/taches-par-projet-stats")
    public List<TachesParProjetDTO> getTachesParProjet() {
        return service.getTachesParProjet();
    }

}

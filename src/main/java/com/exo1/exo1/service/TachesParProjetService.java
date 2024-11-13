package com.exo1.exo1.service;

import com.exo1.exo1.dto.TachesParProjetDTO;
import com.exo1.exo1.repository.ProjetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TachesParProjetService {

    private final ProjetRepository projetRepository;

    public TachesParProjetService(ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }

    public List<TachesParProjetDTO> getTachesParProjet() {
        return projetRepository.findTachesParProjet();
    }
}

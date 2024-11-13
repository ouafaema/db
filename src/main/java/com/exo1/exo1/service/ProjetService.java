package com.exo1.exo1.service;

import com.exo1.exo1.dto.ProjetDTO;
import com.exo1.exo1.entity.Projet;
import com.exo1.exo1.mapper.ProjetMapper;
import com.exo1.exo1.repository.ProjetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProjetService {

    private final ProjetRepository projetRepository;
    private final ProjetMapper projetMapper;

    public ProjetService(ProjetRepository projetRepository, ProjetMapper projetMapper) {
        this.projetRepository = projetRepository;
        this.projetMapper = projetMapper;
    }

    public List<ProjetDTO> getAllProjets() {
        return projetRepository.findAll().stream()
                .map(projetMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProjetDTO getProjetById(Long id) {
        Projet projet = projetRepository.findById(id).orElseThrow(() -> new RuntimeException("Projet not found"));
        return projetMapper.toDTO(projet);
    }

    public ProjetDTO createProjet(ProjetDTO projetDTO) {
        Projet projet = projetMapper.toEntity(projetDTO);
        Projet savedProjet = projetRepository.save(projet);
        return projetMapper.toDTO(savedProjet);
    }

    public ProjetDTO updateProjet(Long id, ProjetDTO projetDTO) {
        Projet projet = projetRepository.findById(id).orElseThrow(() -> new RuntimeException("Projet not found"));
        projet.setNom(projetDTO.getNom());
        projet.setDescription(projetDTO.getDescription());
        Projet updatedProjet = projetRepository.save(projet);
        return projetMapper.toDTO(updatedProjet);
    }

    public void deleteProjet(Long id) {
        projetRepository.deleteById(id);
    }
}
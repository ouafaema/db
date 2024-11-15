package com.exo1.exo1.service;

import com.exo1.exo1.dto.UtilisateurDTO;
import com.exo1.exo1.entity.Utilisateur;
import com.exo1.exo1.mapper.UtilisateurMapper;
import com.exo1.exo1.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final UtilisateurMapper utilisateurMapper;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, UtilisateurMapper utilisateurMapper) {
        this.utilisateurRepository = utilisateurRepository;
        this.utilisateurMapper = utilisateurMapper;
    }

    // Optimized method to avoid N+1 problem by using @EntityGraph in the repository
    /*public List<UtilisateurDTO> getAllUtilisateursWithProjets() {
        return utilisateurRepository.findAllWithProjets().stream()
                .map(utilisateurMapper::toDTO)
                .collect(Collectors.toList());
    }*/

    public Page<UtilisateurDTO> getAllUtilisateursWithProjets(Pageable pageable) {
        return utilisateurRepository.findAllWithProjets(pageable)
                .map(utilisateurMapper::toDTO);
    }

    public UtilisateurDTO getUtilisateurById(Long id) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        return utilisateurMapper.toDTO(utilisateur);
    }

    public UtilisateurDTO createUtilisateur(UtilisateurDTO utilisateurDTO) {
        Utilisateur utilisateur = utilisateurMapper.toEntity(utilisateurDTO);
        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
        return utilisateurMapper.toDTO(savedUtilisateur);
    }

    public UtilisateurDTO updateUtilisateur(Long id, UtilisateurDTO utilisateurDTO) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        utilisateur.setNom(utilisateurDTO.getNom());
        utilisateur.setEmail(utilisateurDTO.getEmail());
        Utilisateur updatedUtilisateur = utilisateurRepository.save(utilisateur);
        return utilisateurMapper.toDTO(updatedUtilisateur);
    }

    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }
}

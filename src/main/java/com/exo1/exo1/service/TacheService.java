package com.exo1.exo1.service;

import com.exo1.exo1.dto.TacheDTO;
import com.exo1.exo1.entity.Tache;
import com.exo1.exo1.mapper.TacheMapper;
import com.exo1.exo1.repository.TacheRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TacheService {

    private final TacheRepository tacheRepository;
    private final TacheMapper tacheMapper;

    public TacheService(TacheRepository tacheRepository, TacheMapper tacheMapper) {
        this.tacheRepository = tacheRepository;
        this.tacheMapper = tacheMapper;
    }

    public List<TacheDTO> getAllTaches() {
        return tacheRepository.findAll().stream()
                .map(tacheMapper::toDTO)
                .collect(Collectors.toList());
    }

    public TacheDTO getTacheById(Long id) {
        Tache tache = tacheRepository.findById(id).orElseThrow(() -> new RuntimeException("Tache not found"));
        return tacheMapper.toDTO(tache);
    }

    public TacheDTO createTache(TacheDTO tacheDTO) {
        Tache tache = tacheMapper.toEntity(tacheDTO);
        Tache savedTache = tacheRepository.save(tache);
        return tacheMapper.toDTO(savedTache);
    }

    public TacheDTO updateTache(Long id, TacheDTO tacheDTO) {
        Tache tache = tacheRepository.findById(id).orElseThrow(() -> new RuntimeException("Tache not found"));
        tache.setTitre(tacheDTO.getTitre());
        tache.setStatut(tacheDTO.getStatut());
        Tache updatedTache = tacheRepository.save(tache);
        return tacheMapper.toDTO(updatedTache);
    }

    public void deleteTache(Long id) {
        tacheRepository.deleteById(id);
    }
}

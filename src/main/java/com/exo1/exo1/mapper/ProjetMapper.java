package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.ProjetDTO;
import com.exo1.exo1.entity.Projet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjetMapper {
    ProjetDTO toDTO(Projet projet);
    Projet toEntity(ProjetDTO projetDTO);
}

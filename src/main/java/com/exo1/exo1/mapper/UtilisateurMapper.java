package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.UtilisateurDTO;
import com.exo1.exo1.entity.Utilisateur;
import org.mapstruct.Mapper;

//test
@Mapper(componentModel = "spring")
public interface UtilisateurMapper {
    UtilisateurDTO toDTO(Utilisateur utilisateur);
    Utilisateur toEntity(UtilisateurDTO utilisateurDTO);
}

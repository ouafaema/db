package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.TacheDTO;
import com.exo1.exo1.entity.Tache;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TacheMapper {
    TacheDTO toDTO(Tache tache);
    Tache toEntity(TacheDTO tacheDTO);
}

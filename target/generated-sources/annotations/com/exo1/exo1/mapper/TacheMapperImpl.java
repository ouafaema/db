package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.TacheDTO;
import com.exo1.exo1.entity.Tache;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-13T11:06:17+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class TacheMapperImpl implements TacheMapper {

    @Override
    public TacheDTO toDTO(Tache tache) {
        if ( tache == null ) {
            return null;
        }

        TacheDTO tacheDTO = new TacheDTO();

        tacheDTO.setId( tache.getId() );
        tacheDTO.setTitre( tache.getTitre() );
        tacheDTO.setStatut( tache.getStatut() );

        return tacheDTO;
    }

    @Override
    public Tache toEntity(TacheDTO tacheDTO) {
        if ( tacheDTO == null ) {
            return null;
        }

        Tache tache = new Tache();

        tache.setId( tacheDTO.getId() );
        tache.setTitre( tacheDTO.getTitre() );
        tache.setStatut( tacheDTO.getStatut() );

        return tache;
    }
}

package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.ProjetDTO;
import com.exo1.exo1.entity.Projet;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-12T14:28:29+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class ProjetMapperImpl implements ProjetMapper {

    @Override
    public ProjetDTO toDTO(Projet projet) {
        if ( projet == null ) {
            return null;
        }

        ProjetDTO projetDTO = new ProjetDTO();

        projetDTO.setId( projet.getId() );
        projetDTO.setNom( projet.getNom() );
        projetDTO.setDescription( projet.getDescription() );

        return projetDTO;
    }

    @Override
    public Projet toEntity(ProjetDTO projetDTO) {
        if ( projetDTO == null ) {
            return null;
        }

        Projet projet = new Projet();

        projet.setId( projetDTO.getId() );
        projet.setNom( projetDTO.getNom() );
        projet.setDescription( projetDTO.getDescription() );

        return projet;
    }
}

package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.UtilisateurDTO;
import com.exo1.exo1.entity.Utilisateur;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-13T11:06:17+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class UtilisateurMapperImpl implements UtilisateurMapper {

    @Override
    public UtilisateurDTO toDTO(Utilisateur utilisateur) {
        if ( utilisateur == null ) {
            return null;
        }

        UtilisateurDTO utilisateurDTO = new UtilisateurDTO();

        utilisateurDTO.setId( utilisateur.getId() );
        utilisateurDTO.setNom( utilisateur.getNom() );
        utilisateurDTO.setEmail( utilisateur.getEmail() );

        return utilisateurDTO;
    }

    @Override
    public Utilisateur toEntity(UtilisateurDTO utilisateurDTO) {
        if ( utilisateurDTO == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setId( utilisateurDTO.getId() );
        utilisateur.setNom( utilisateurDTO.getNom() );
        utilisateur.setEmail( utilisateurDTO.getEmail() );

        return utilisateur;
    }
}

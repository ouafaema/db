package com.exo1.exo1.dto;

import lombok.Data;
import java.util.List;

@Data
public class UtilisateurDTO {
    private Long id;
    private String nom;
    private String email;
    private List<Long> projetsIds;
}

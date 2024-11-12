package com.exo1.exo1.dto;

import lombok.Data;
import java.util.List;

@Data
public class ProjetDTO {
    private Long id;
    private String nom;
    private String description;
    private List<Long> utilisateursIds;
    private List<Long> tachesIds;
}

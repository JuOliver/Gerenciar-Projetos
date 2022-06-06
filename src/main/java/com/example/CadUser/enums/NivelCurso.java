package com.example.cadastroprojetos.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum NivelCurso {
    GRADUACAO("Graduação"),
    ESPECIALIZACAO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado");

    private final String label;

    NivelCurso(String label){ this.label = label;}

    public String getLabel() {
        return label;
    }

    public static List<NivelCurso> nivelCursoList(){return Arrays.asList(values());}
}

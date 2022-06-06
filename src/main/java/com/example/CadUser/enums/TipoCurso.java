package com.example.cadastroprojetos.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoCurso {
    LICENCIATURA("Licenciatura"),
    TECNOLOGO("Tecnologo"),
    BACHARELADO("Bacharelado");

    private final String label;

    TipoCurso(String label){ this.label = label;}

    public String getLabel() {
        return label;
    }

    public static List<TipoCurso> tipoCursoList(){return Arrays.asList(values());}
}

package com.example.cadastroprojetos.domain.enums;

import java.util.Arrays;
import java.util.List;

public enum ModalidadeCurso {
    PRESENCIAL("Presencial"),
    REMOTO("Remoto"),
    HIBRIDO("Híbrido");

    private final String label;

    ModalidadeCurso(String label){ this.label = label;}

    public String getLabel() {
        return label;
    }

    public static List<ModalidadeCurso> modalidadeCursoList(){return Arrays.asList(values());}
}

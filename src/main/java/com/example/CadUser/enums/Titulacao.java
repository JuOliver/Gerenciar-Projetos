package com.example.cadastroprojetos.domain.enums;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public enum Titulacao {
    ESPECIALISTA("Especialista"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado");

    private final String label;

    Titulacao(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static List<Titulacao> list() {
        return Arrays.asList(values());
    }
}

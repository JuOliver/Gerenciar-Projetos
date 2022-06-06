package com.example.cadastroprojetos.domain.model;

import com.example.cadastroprojetos.domain.enums.ModalidadeCurso;
import com.example.cadastroprojetos.domain.enums.NivelCurso;
import com.example.cadastroprojetos.domain.enums.TipoCurso;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl_curso")
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo_curso")
    private TipoCurso tipoCurso;
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_curso")
    private NivelCurso nivelCurso;
    @Enumerated(EnumType.STRING)
    @Column(name = "modalidade_curso")
    private ModalidadeCurso modalidadeCurso;

    public Curso() {
    }

    public Curso(Integer idCurso, String nome, TipoCurso tipoCurso, NivelCurso nivelCurso, ModalidadeCurso modalidadeCurso) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.tipoCurso = tipoCurso;
        this.nivelCurso = nivelCurso;
        this.modalidadeCurso = modalidadeCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public NivelCurso getNivelCurso() {
        return nivelCurso;
    }

    public void setNivelCurso(NivelCurso nivelCurso) {
        this.nivelCurso = nivelCurso;
    }

    public ModalidadeCurso getModalidadeCurso() {
        return modalidadeCurso;
    }

    public void setModalidadeCurso(ModalidadeCurso modalidadeCurso) {
        this.modalidadeCurso = modalidadeCurso;
    }
}

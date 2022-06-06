package com.example.cadastroprojetos.domain.model;

import com.example.cadastroprojetos.domain.enums.Titulacao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_professor")
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String matricula;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Titulacao titulacao;
    private String celular;
    private String email;
    private String graduacao;
    private Integer ipei;

    public Professor() {
    }

    public Professor(Integer id, String matricula, String nome, Titulacao titulacao, String celular, String email, String graduacao, Integer ipei) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
        this.celular = celular;
        this.email = email;
        this.graduacao = graduacao;
        this.ipei = ipei;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public Integer getIpei() {
        return ipei;
    }

    public void setIpei(Integer ipei) {
        this.ipei = ipei;
    }
}

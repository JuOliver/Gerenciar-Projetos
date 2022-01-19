package com.example.CadUser.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "usuario_tb")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String celular;

    public Usuario() {
    }

    public Usuario(String nome, String celular) {
        this.nome = nome;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idCad) {
        this.id = idCad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}

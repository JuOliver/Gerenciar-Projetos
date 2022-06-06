package com.example.CadUser.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class ProjetoExtensao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String tituloProjeto;
    private String introducao;
    private String justificativa;
    private String objetivos;
    private String metodologia;
    private String viabilidade;
    private String metas;
    private String impactoSocial;
    private String abrangencia;
    private String referencias;
    private String tipoProjeto;
    private String cargaHoraria;
    private boolean alunosVinculados;

    public ProjetoExtensao() {
    }

    public ProjetoExtensao(String tituloProjeto, String introducao, String justificativa, String objetivos, String metodologia, String viabilidade, String metas, String impactoSocial, String abrangencia, String referencias, String tipoProjeto, String cargaHoraria, boolean alunosVinculados) {
        this.tituloProjeto = tituloProjeto;
        this.introducao = introducao;
        this.justificativa = justificativa;
        this.objetivos = objetivos;
        this.metodologia = metodologia;
        this.viabilidade = viabilidade;
        this.metas = metas;
        this.impactoSocial = impactoSocial;
        this.abrangencia = abrangencia;
        this.referencias = referencias;
        this.tipoProjeto = tipoProjeto;
        this.cargaHoraria = cargaHoraria;
        this.alunosVinculados = alunosVinculados;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloProjeto() {
        return tituloProjeto;
    }

    public void setTituloProjeto(String tituloProjeto) {
        this.tituloProjeto = tituloProjeto;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getViabilidade() {
        return viabilidade;
    }

    public void setViabilidade(String viabilidade) {
        this.viabilidade = viabilidade;
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getImpactoSocial() {
        return impactoSocial;
    }

    public void setImpactoSocial(String impactoSocial) {
        this.impactoSocial = impactoSocial;
    }

    public String getAbrangencia() {
        return abrangencia;
    }

    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getTipoProjeto() {
        return tipoProjeto;
    }

    public void setTipoProjeto(String tipoProjeto) {
        this.tipoProjeto = tipoProjeto;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isAlunosVinculados() {
        return alunosVinculados;
    }

    public void setAlunosVinculados(boolean alunosVinculados) {
        this.alunosVinculados = alunosVinculados;
    }
}

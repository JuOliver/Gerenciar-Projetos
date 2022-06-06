package com.example.cadastroprojetos.controller;

import com.example.cadastroprojetos.dao.ProfessorDAO;
import com.example.cadastroprojetos.domain.model.Professor;

import java.util.List;


public class ProfessorController {
    private ProfessorDAO professorDAO = new ProfessorDAO();
    private Professor professor;
    private List<Professor> professores;

    public void init(){
        this.professor = null;
        this.professorList();
    }

    public void salvar(){
        professorDAO.salvarProfessor(this.professor);
        this.init();
    }

    public void cadastrarProfessor(){this.professor = new Professor();}

    public void voltar(){
        this.init();
    }

    public void editar(Integer id){
        Professor professorEditar = professorDAO.editar(id);
        this.professor.setId(professorEditar.getId());
        this.professor.setNome(professorEditar.getNome());
        this.professor.setCelular(professorEditar.getCelular());
        this.professor.setEmail(professorEditar.getEmail());
        this.professor.setGraduacao(professorEditar.getGraduacao());
        this.professor.setTitulacao(professorEditar.getTitulacao());
        this.professor.setMatricula(professorEditar.getMatricula());
        this.professor.setIpei(professorEditar.getIpei());
    }

    public void excluir(Integer id){
        professorDAO.excluirProfessor(id);

    }

    public void professorList(){
        this.professores = professorDAO.ProfessorList();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
}

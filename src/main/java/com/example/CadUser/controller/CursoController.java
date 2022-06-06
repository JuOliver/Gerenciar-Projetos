package com.example.cadastroprojetos.controller;

import com.example.cadastroprojetos.dao.CursoDAO;
import com.example.cadastroprojetos.domain.model.Curso;
import com.example.cadastroprojetos.domain.model.Professor;

import java.util.List;

public class CursoController {
    private CursoDAO cursoDAO = new CursoDAO();
    private Curso curso;
    private List<Curso> cursoList;

    public void init(){
        this.curso = null;
        this.CursoList();
    }

    public void salvarCurso(){
        cursoDAO.salvarCurso(curso);
    }

    public void cadastrarCurso(){
        this.curso = new Curso();
    }

    public void editarCurso(Integer id){
        Curso cursoEditar = cursoDAO.editar(id);
        this.curso.setIdCurso(cursoEditar.getIdCurso());
        this.curso.setNome(cursoEditar.getNome());
        this.curso.setTipoCurso(cursoEditar.getTipoCurso());
        this.curso.setNivelCurso(cursoEditar.getNivelCurso());
        this.curso.setModalidadeCurso(cursoEditar.getModalidadeCurso());
    }

    public void excluirCurso(Integer id){
        cursoDAO.excluirCurso(id);
    }

    public void voltar(){ this.init();}

    public void CursoList(){
        this.cursoList = cursoDAO.CursoList();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }
}

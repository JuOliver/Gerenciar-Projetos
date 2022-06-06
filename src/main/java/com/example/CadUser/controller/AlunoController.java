package com.example.CadUser.controller;

import com.example.CadUser.dao.AlunoDAO;
import com.example.CadUser.model.Aluno;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

//Ctrl + ALT + O para limpar importacoes nao utilizadas
@ManagedBean
@ViewScoped
public class UsuarioController implements Serializable {

    private AlunoDAO alunoDAO = new AlunoDAO();

    private Aluno aluno;

    private List<Aluno> alunos;

    @PostConstruct
    public void init() {
        this.aluno = null;
        this.listaUsuarios();
    }

    public void salvar() {
        alunoDAO.salvar(this.aluno);
        this.init();
    }

    public void cadastrarUsuario(){
        this.aluno = new Aluno();
    }

    public void voltar(){
        this.init();
    }

    public void editar(Long idCad) {
        Aluno userEditar = alunoDAO.editar(idCad);
        this.aluno.setIdAluno(userEditar.getIdAluno());
        this.aluno.setNome(userEditar.getNome());
        this.aluno.setCelular(userEditar.getCelular());
        this.aluno.setEmail(userEditar.getEmail());

    }

    public void excluir(Long idCad) {
        alunoDAO.excluir(idCad);
        this.listaUsuarios();

    }

    public void listaUsuarios() {
        this.alunos = alunoDAO.listaAlunos();

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}

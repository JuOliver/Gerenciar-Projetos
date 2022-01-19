package com.example.CadUser.controller;

import com.example.CadUser.dao.UsuarioDAO;
import com.example.CadUser.model.Usuario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

//Ctrl + ALT + O para limpar importacoes nao utilizadas
@ManagedBean
@ViewScoped
public class UsuarioController implements Serializable {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    private Usuario usuario;

    private List<Usuario> usuarios;

    @PostConstruct
    public void init() {
        this.usuario = null;
        this.listaUsuarios();
    }

    public void salvar() {
        usuarioDAO.salvar(this.usuario);
        this.init();
    }

    public void cadastrarUsuario(){
        this.usuario = new Usuario();
    }

    public void voltar(){
        this.init();
    }

    public void editar(Long idCad) {
        Usuario userEditar = usuarioDAO.editar(idCad);
        this.usuario.setId(userEditar.getId());
        this.usuario.setNome(userEditar.getNome());
        this.usuario.setCelular(userEditar.getCelular());

    }

    public void excluir(Long idCad) {
        usuarioDAO.excluir(idCad);
        this.listaUsuarios();

    }

    public void listaUsuarios() {
        this.usuarios = usuarioDAO.listaUsuarios();

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

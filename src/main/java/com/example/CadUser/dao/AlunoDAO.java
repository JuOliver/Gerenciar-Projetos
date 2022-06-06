package com.example.CadUser.dao;

import com.example.CadUser.cdi.JPAUtil;
import com.example.CadUser.model.Usuario;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class UsuarioDAO implements Serializable {

    public Usuario salvar(Usuario usuario) { //CREATE
        EntityManager em = JPAUtil.getEmf();
        em.getTransaction().begin();
        if (usuario.getId() != null) {
            em.merge(usuario);

        } else {
            em.persist(usuario);
        }
        em.getTransaction().commit();
        em.close();

        return usuario;
    }

    public void excluir(Long idCad) { //DELETE
        EntityManager em = JPAUtil.getEmf();
        Usuario usuario = em.find(Usuario.class, idCad);
        em.getTransaction().begin();
        em.remove(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public List<Usuario> listaUsuarios() { //READ
        EntityManager em = JPAUtil.getEmf();
        return em.createQuery(
                        "select a from Usuario a", Usuario.class)
                .getResultList();
    }

    public Usuario editar(Long idCad) {
        EntityManager em = JPAUtil.getEmf();
        Usuario usuario = em.find(Usuario.class, idCad);
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
        return usuario;
    }

}

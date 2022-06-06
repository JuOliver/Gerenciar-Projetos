package com.example.cadastroprojetos.dao;

import com.example.cadastroprojetos.cdi.JPAUtil;
import com.example.cadastroprojetos.domain.model.Curso;

import javax.persistence.EntityManager;
import java.util.List;

public class CursoDAO {

    public Curso salvarCurso(Curso curso) {
        EntityManager em = JPAUtil.getEmf();
        em.getTransaction().begin();
        if (curso.getIdCurso() != null) {
            em.merge(curso);
        } else {
            em.persist(curso);
        }
        em.getTransaction().commit();
        em.close();
        return curso;
    }

    public void excluirCurso(Integer id) {
        EntityManager em = JPAUtil.getEmf();
        Curso curso = em.find(Curso.class, id);
        em.getTransaction().begin();
        em.remove(curso);
        em.getTransaction().commit();
        em.close();
    }

    public List<Curso> CursoList() {
        EntityManager em = JPAUtil.getEmf();
        return em.createQuery(
                        "SELECT c FROM Curso c", Curso.class)
                .getResultList();
    }

    public Curso editar(Integer id) {
        EntityManager em = JPAUtil.getEmf();
        Curso curso = em.find(Curso.class, id);
        em.getTransaction().begin();
        em.merge(curso);
        em.getTransaction().commit();
        em.close();
        return curso;
    }

}

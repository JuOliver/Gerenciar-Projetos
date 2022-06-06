package com.example.cadastroprojetos.dao;

import com.example.cadastroprojetos.cdi.JPAUtil;
import com.example.cadastroprojetos.domain.model.Professor;

import javax.persistence.EntityManager;
import java.util.List;

public class ProfessorDAO {

    public Professor salvarProfessor(Professor professor) {
        EntityManager em = JPAUtil.getEmf();
        em.getTransaction().begin();
        if (professor.getId() != null) {
            em.merge(professor);
        } else {
            em.persist(professor);
        }
        em.getTransaction().commit();
        em.close();
        return professor;
    }

    public void excluirProfessor(Integer id) {
        EntityManager em = JPAUtil.getEmf();
        Professor professor = em.find(Professor.class, id);
        em.getTransaction().begin();
        em.remove(professor);
        em.getTransaction().commit();
        em.close();
    }

    public List<Professor> ProfessorList() {
        EntityManager em = JPAUtil.getEmf();
        return em.createQuery(
                        "SELECT p FROM Professor p", Professor.class)
                .getResultList();
    }

    public Professor editar(Integer id) {
        EntityManager em = JPAUtil.getEmf();
        Professor professor = em.find(Professor.class, id);
        em.getTransaction().begin();
        em.merge(professor);
        em.getTransaction().commit();
        em.close();
        return professor;
    }
}

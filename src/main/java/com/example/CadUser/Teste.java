package com.example.CadUser;

import com.example.CadUser.cdi.JPAUtil;
import com.example.CadUser.dao.UsuarioDAO;
import com.example.CadUser.model.Usuario;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

@ManagedBean
public class Teste {
    public static EntityManager em = JPAUtil.getEmf();

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.setId(1L);
        u1.setNome("Maria");
        u1.setCelular("34445");

        UsuarioDAO dao = new UsuarioDAO();
        u1= dao.salvar(u1);
        System.out.println("u1 salvo");


    }
}

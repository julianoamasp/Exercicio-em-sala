package com.usjt.usjt_ccp3anmca_jpa_hibernate.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.usjt.usjt_ccp3anmca_jpa_hibernate.model.Usuario;

import util.JPAUtil;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario u = new Usuario ();
		u.setNome("Ana");
		u.setFone("11223344");
		u.setEmail("ana@usjt.br");
		manager.persist(u);
		transaction.commit();
		manager.close();
		JPAUtil.close();
		}

}

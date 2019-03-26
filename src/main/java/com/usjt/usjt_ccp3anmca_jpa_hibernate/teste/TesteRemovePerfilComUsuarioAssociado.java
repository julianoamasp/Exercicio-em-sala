package com.usjt.usjt_ccp3anmca_jpa_hibernate.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.usjt.usjt_ccp3anmca_jpa_hibernate.model.Perfil;

import util.JPAUtil;

public class TesteRemovePerfilComUsuarioAssociado {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Perfil p = manager.find(Perfil.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
		}
}

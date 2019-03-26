package com.usjt.usjt_ccp3anmca_jpa_hibernate.teste;

import javax.persistence.EntityManager;

import com.usjt.usjt_ccp3anmca_jpa_hibernate.model.Usuario;

import util.JPAUtil;

public class TesteBuscaPorIdComFind {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println(u);
		manager.close();
		JPAUtil.close();
		}
}

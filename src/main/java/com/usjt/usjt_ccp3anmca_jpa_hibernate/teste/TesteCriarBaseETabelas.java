package com.usjt.usjt_ccp3anmca_jpa_hibernate.teste;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
		}

}

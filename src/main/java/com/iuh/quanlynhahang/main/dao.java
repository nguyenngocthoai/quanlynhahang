package com.iuh.quanlynhahang.main;

import javax.persistence.EntityManager;

public class dao {
	private EntityManager em;

	public dao() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

}

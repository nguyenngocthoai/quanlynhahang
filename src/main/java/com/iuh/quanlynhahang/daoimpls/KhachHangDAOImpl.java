package com.iuh.quanlynhahang.daoimpls;

import javax.persistence.EntityManager;

import com.iuh.quanlynhahang.MyEntityManager;

public class KhachHangDAOImpl {
	private EntityManager em;

	public KhachHangDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

}

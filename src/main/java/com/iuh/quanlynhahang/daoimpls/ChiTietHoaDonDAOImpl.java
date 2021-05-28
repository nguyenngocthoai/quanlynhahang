package com.iuh.quanlynhahang.daoimpls;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.IChiTietHoaDon;
import com.iuh.quanlynhahang.entities.ChiTietHoaDon;

public class ChiTietHoaDonDAOImpl implements IChiTietHoaDon {
	private EntityManager em;

	public ChiTietHoaDonDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

	@Override
	public boolean createCTHD(ChiTietHoaDon cthd) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(cthd);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			return false;
		}
	}

}

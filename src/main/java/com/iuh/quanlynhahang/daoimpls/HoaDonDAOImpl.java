package com.iuh.quanlynhahang.daoimpls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.IHoaDonDAO;
import com.iuh.quanlynhahang.entities.HoaDon;

public class HoaDonDAOImpl implements IHoaDonDAO {
	private EntityManager em;

	public HoaDonDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

	@Override
	public boolean createHoaDon(HoaDon hd) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(hd);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public HoaDon getHoaDonById(String id) {
		return em.find(HoaDon.class, id);
	}

	@Override
	public List<HoaDon> getAllHoaDon() {
		return em.createQuery("select hd from HoaDon hd", HoaDon.class).getResultList();
	}

}

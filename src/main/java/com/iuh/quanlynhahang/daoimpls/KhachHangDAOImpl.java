package com.iuh.quanlynhahang.daoimpls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.IKhachHangDAO;
import com.iuh.quanlynhahang.entities.KhachHang;

public class KhachHangDAOImpl implements IKhachHangDAO {
	private EntityManager em;

	public KhachHangDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

	@Override
	public boolean createKH(KhachHang kh) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(kh);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public List<KhachHang> getAllKH() {
		return em.createQuery("select kh from KhachHang kh", KhachHang.class).getResultList();
	}

	@Override
	public boolean updateKH(KhachHang kh) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(kh);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public KhachHang getKHByID(String maKH) {
		return em.find(KhachHang.class, maKH);
	}

	@Override
	public KhachHang getKHBySDT(String sDT) {
		return em.createQuery("select kh from KhachHang kh where soDienThoai=" +"'"+ sDT+"'", KhachHang.class)
				.getSingleResult();
	}

	@Override
	public List<KhachHang> getKHByTen(String ten) {
		return em.createQuery("select kh from KhachHang kh where tenKhachHang like" + ten + "%", KhachHang.class)
				.getResultList();
	}

}

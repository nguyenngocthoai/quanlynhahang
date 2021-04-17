package com.iuh.quanlynhahang.daoimpls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.INhanVienDAO;
import com.iuh.quanlynhahang.entities.NhanVien;

public class NhanVienDAOImpl implements INhanVienDAO {
	private EntityManager em;

	public NhanVienDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

	@Override
	public boolean createNV(NhanVien nv) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(nv);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public List<NhanVien> getAllNV() {
		return em.createQuery("select nv from NhanVien nv", NhanVien.class).getResultList();
	}

	@Override
	public boolean updateNV(NhanVien nv) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(nv);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public NhanVien getNVByID(String maNV) {
		return em.find(NhanVien.class, maNV);
	}

	@Override
	public NhanVien getNVBySDT(String sDT) {
		return em.find(NhanVien.class, sDT);
	}

}

package com.iuh.quanlynhahang.daoimpls;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.IMonDAO;
import com.iuh.quanlynhahang.entities.Mon;

public class MonDAOImpl implements IMonDAO {
	private EntityManager em;

	public MonDAOImpl() {
		em = MyEntityManager.getInstance().getEntityManager();
	}

	@Override
	public boolean createMon(Mon mon) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(mon);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateMon(Mon mon) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(mon);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteMon(Mon mon) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.remove(mon);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			return false;
		}
	}

	@Override
	public Mon getMonByTen(String tenMon) {
		return em.createQuery("select m from Mon m where tenMon=:tenMon", Mon.class).setParameter("tenMon", tenMon)
				.getSingleResult();
	}

	@Override
	public Mon getMonByMa(String maMon) {
		return em.find(Mon.class, maMon);
	}

	@Override
	public List<Mon> getAllMon() {
		return em.createQuery("select m from Mon m", Mon.class).getResultList();
	}
}

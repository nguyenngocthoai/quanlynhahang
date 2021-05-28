package com.iuh.quanlynhahang.daoimpls;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iuh.quanlynhahang.MyEntityManager;
import com.iuh.quanlynhahang.daos.IHoaDonDAO;
import com.iuh.quanlynhahang.entities.HoaDon;
import com.iuh.quanlynhahang.entities.KhachHang;
import com.iuh.quanlynhahang.entities.NhanVien;

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

	@Override
	public List<HoaDon> getAllHoaDon(int thang, int nam) {
		// TODO Auto-generated method stub
		return em.createQuery("select hd from HoaDon hd where MONTH(hd.ngayXuatHoaDon) ='" + thang
				+ "' and YEAR(hd.ngayXuatHoaDon)='" + nam + "'", HoaDon.class).getResultList();
	}

	@Override
	public List<HoaDon> getHoaDonByDate(String ngayBD, String ngayEnd) {
		// TODO Auto-generated method stub
		return em.createQuery(
				"select hd from HoaDon hd where ngayXuatHoaDon between '" + ngayBD + "' and '" + ngayEnd + "'",
				HoaDon.class).getResultList();
	}

	@Override
	public List<HoaDon> searchHD(String tenKhachHang, String hoTenNhanVien, String tuNgay, String denNgay) {
		// TODO Auto-generated method stub
		return em.createQuery(
				"select kh.tenKhachHang,nv.hoTenNhanVien,hd.ngayXuatHoaDon from "+HoaDon.class.getName()+" hd join "+KhachHang.class.getName()+" kh on kh.maKhachHang=hd.KhachHang.maKhachHang "
				+ "join "+NhanVien.class.getName()+" nv on nv.maNhanVien=hd.NhanVien.maNhanVien where kh.tenKhachHang like :tenKhachHang and "
				+ "nv.hoTenNhanVien like: hoTenNhanVien and hd.ngayXuatHoaDon between '"
						+ tuNgay + "' and '" + denNgay + "'",
				HoaDon.class).setParameter("tenKhachHang", tenKhachHang).setParameter("hoTenNhanVien", hoTenNhanVien)
				.getResultList();
	}

}

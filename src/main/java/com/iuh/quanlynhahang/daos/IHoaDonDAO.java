package com.iuh.quanlynhahang.daos;

import java.sql.Date;
import java.util.List;

import com.iuh.quanlynhahang.entities.HoaDon;

public interface IHoaDonDAO {
	public boolean createHoaDon(HoaDon hd);

	public HoaDon getHoaDonById(String id);
	
	public List<HoaDon> getAllHoaDon();

	public List<HoaDon> getAllHoaDon(int thang,int nam);
	
	public List<HoaDon> getHoaDonByDate(String tuNgay,String denNgay);
	
	public List<HoaDon> searchHD(String tenKhachHang, String hoTenNhanVien, String tuNgay, String denNgay);
}

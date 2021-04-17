package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.entities.KhachHang;

public interface IKhachHangDAO {
	public boolean createKH(KhachHang kh);

	public List<KhachHang> getAllKH();

	public boolean updateKH(KhachHang kh);

	public KhachHang getKHByID(String maKH);

	public KhachHang getKHBySDT(String sDT);
}

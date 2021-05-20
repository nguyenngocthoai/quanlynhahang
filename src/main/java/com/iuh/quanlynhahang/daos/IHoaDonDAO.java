package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.entities.HoaDon;

public interface IHoaDonDAO {
	public boolean createHoaDon(HoaDon hd);

	public HoaDon getHoaDonById(String id);
	
	public List<HoaDon> getAllHoaDon();

}

package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.guis.TaiKhoan;

public interface ITaiKhoanDAO {
	public boolean createTK(TaiKhoan tk);

	public boolean deleteTK(TaiKhoan tk);

	public TaiKhoan getTKByTenTK(String tenTK);

	public List<TaiKhoan> getALLTK();

}

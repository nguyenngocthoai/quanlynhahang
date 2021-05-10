package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.entities.Mon;

public interface IMonDAO {
	public boolean createMon(Mon mon);

	public boolean updateMon(Mon mon);

	public boolean deleteMon(Mon mon);

	public Mon getMonByTen(String tenMon);

	public Mon getMonByMa(String maMon);

	public List<Mon> getAllMon();

}

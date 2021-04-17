package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.entities.Ban;

public interface IBanDAO {
	public boolean createBan(Ban ban);

	public boolean updateBan(Ban ban);

	public boolean deleteBanById(Ban ban);

	public Ban getBanById(String maBan);

	public List<Ban> getBansBySanh(String sanh);
	
	public List<Ban> getAllBan();

}

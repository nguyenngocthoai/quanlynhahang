
package com.iuh.quanlynhahang.daos;

import java.util.List;

import com.iuh.quanlynhahang.entities.Mon;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.iuh.quanlynhahang.entities.Mon;
import com.quanlynhahang.dto.PhieuDatBan_Mon;

public interface IMonDAO {
	public boolean createMon(Mon mon);

	public boolean updateMon(Mon mon);

	public boolean deleteMon(Mon mon);

	public Mon getMonByTen(String tenMon);

	public Mon getMonByMa(String maMon);

	public List<Mon> getAllMon();

	public List<String> ThongKeMonAn(String chon,Date tuNgay,Date denNgay);
	
	public List<String> ThongKeMonAnNhieuNhatTrongThang(int thang, int nam);
	
	public List<String> ThongKeSoLanDatNhieuNhatTrongThang(int thang, int nam);
	
	public List<String> ThongKeDoUongNhieuNhatTrongThang(int thang, int nam, String doUong);
	
	public List<String> getAllMaMon(List<Mon> mons);
	
	public List<Mon> searchMon(String tenMon,String loaiMon,BigDecimal tienMin, BigDecimal tienMax);
}

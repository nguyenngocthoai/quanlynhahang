package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChiTietHoaDon
 *
 */
@Entity
@IdClass(ChiTietHoaDon_PK.class)
public class ChiTietHoaDon implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	@Id
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maBanTiec")
	private PhieuDatBan banTiec;
	private int soLuong;

	public ChiTietHoaDon() {
		super();
	}

	public ChiTietHoaDon(HoaDon hoaDon, PhieuDatBan banTiec, int soLuong) {
		super();
		this.hoaDon = hoaDon;
		this.banTiec = banTiec;
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public PhieuDatBan getBanTiec() {
		return banTiec;
	}

	public void setBanTiec(PhieuDatBan banTiec) {
		this.banTiec = banTiec;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}

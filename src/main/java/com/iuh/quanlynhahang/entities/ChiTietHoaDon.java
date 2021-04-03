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
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	@Id
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maBanTiec")
	private BanTiec banTiec;
	private int soLuong;

	public ChiTietHoaDon() {
		super();
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public BanTiec getBanTiec() {
		return banTiec;
	}

	public void setBanTiec(BanTiec banTiec) {
		this.banTiec = banTiec;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}

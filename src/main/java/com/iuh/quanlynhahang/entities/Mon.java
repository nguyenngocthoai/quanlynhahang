package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: MonAn
 *
 */
@Entity

public class Mon implements Serializable {
	@Id
	private String maMon;
	private String tenMon;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maLoaiMon")
	private LoaiMon loaiMon;
	private int soLuong;
	private BigDecimal giaTien;
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "maBanTiec")
//	private BanTiec banTiec;

	// =============
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "maMon")
//	private Set<BanTiec> banTiecs;

	private static final long serialVersionUID = 1L;

	public Mon() {
		super();
	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public LoaiMon getLoaiMon() {
		return loaiMon;
	}

	public void setLoaiMon(LoaiMon loaiMon) {
		this.loaiMon = loaiMon;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public BigDecimal getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(BigDecimal giaTien) {
		this.giaTien = giaTien;
	}

}

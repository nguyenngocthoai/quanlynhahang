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
	private int soKg;
	private BigDecimal giaMon;
	private BigDecimal giaKg;
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

	
	
	public Mon(String maMon, String tenMon, LoaiMon loaiMon, int soLuong, int soKg, BigDecimal giaMon,
			BigDecimal giaKg) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.soLuong = soLuong;
		this.soKg = soKg;
		this.giaMon = giaMon;
		this.giaKg = giaKg;
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

	public int getSoKg() {
		return soKg;
	}

	public void setSoKg(int soKg) {
		this.soKg = soKg;
	}

	public BigDecimal getGiaMon() {
		return giaMon;
	}

	public void setGiaMon(BigDecimal giaMon) {
		this.giaMon = giaMon;
	}

	public BigDecimal getGiaKg() {
		return giaKg;
	}

	public void setGiaKg(BigDecimal giaKg) {
		this.giaKg = giaKg;
	}

	

}

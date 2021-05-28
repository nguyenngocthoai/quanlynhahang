package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: MonAn
 *
 */
@Entity

public class Mon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String maMon;
	@Column(columnDefinition = "nvarchar(150)")
	private String tenMon;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maLoaiMon")
	private LoaiMon loaiMon;
	private BigDecimal giaTien;
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "maBanTiec")
//	private BanTiec banTiec;

	// =============
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "maMon")
//	private Set<BanTiec> banTiecs;

	@ElementCollection
	@Column(columnDefinition = "nvarchar(300)")
	private List<String> donViTinh=new ArrayList<String>();

	public Mon() {
		super();
	}

	public Mon(String maMon, String tenMon, LoaiMon loaiMon, BigDecimal giaTien) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.giaTien = giaTien;
	}
	
	

	public Mon(String maMon, String tenMon, LoaiMon loaiMon, BigDecimal giaTien, List<String> donViTinh) {
		super();
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.loaiMon = loaiMon;
		this.giaTien = giaTien;
		this.donViTinh = donViTinh;
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

	public BigDecimal getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(BigDecimal giaTien) {
		this.giaTien = giaTien;
	}

	public List<String> getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(List<String> donViTinh) {
		this.donViTinh = donViTinh;
	}
}

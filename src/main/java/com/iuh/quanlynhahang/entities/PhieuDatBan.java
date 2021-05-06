package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: DatMon
 *
 */
@Entity
public class PhieuDatBan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String maBanTiec;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maKhachhang")
	private KhachHang khachHang;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PhieuDatBan_Ban", joinColumns = @JoinColumn(name = "maBanTiec", referencedColumnName = "maBanTiec"), inverseJoinColumns = @JoinColumn(name = "maBan", referencedColumnName = "maBan"))
//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "maBanTiec")
	private Set<Ban> bans;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PhieuDatBan_Mon", joinColumns = @JoinColumn(name = "maBanTiec", referencedColumnName = "maBanTiec"), inverseJoinColumns = @JoinColumn(name = "maMon", referencedColumnName = "maMon"))
	private Set<Mon> monAns;
	private LocalDate ngayDatMon;
	private LocalDate ngaySuDung;
	private String gioSuDung;
	@Column(columnDefinition = "nvarchar(30)")
	private String trangThaiThanhToan;
	private int soLuongNguoi;
	private int soLuongMon;
	private BigDecimal tienCoc;
	@Column(columnDefinition = "nvarchar(30)")
	private String donViTinh;

	public PhieuDatBan() {
		super();
	}

	public PhieuDatBan(String maBanTiec, KhachHang khachHang, Set<Ban> bans, Set<Mon> monAns, LocalDate ngayDatMon,
			LocalDate ngaySuDung, String gioSuDung, String trangThaiThanhToan, int soLuongNguoi, int soLuongMon,
			BigDecimal tienCoc, String donViTinh) {
		super();
		this.maBanTiec = maBanTiec;
		this.khachHang = khachHang;
		this.bans = bans;
		this.monAns = monAns;
		this.ngayDatMon = ngayDatMon;
		this.ngaySuDung = ngaySuDung;
		this.gioSuDung = gioSuDung;
		this.trangThaiThanhToan = trangThaiThanhToan;
		this.soLuongNguoi = soLuongNguoi;
		this.soLuongMon = soLuongMon;
		this.tienCoc = tienCoc;
		this.donViTinh = donViTinh;
	}

	public String getMaBanTiec() {
		return maBanTiec;
	}

	public void setMaBanTiec(String maBanTiec) {
		this.maBanTiec = maBanTiec;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

//	public Set<Ban> getBans() {
//		return bans;
//	}
//
//	public void setBans(Set<Ban> bans) {
//		this.bans = bans;
//	}
//
//	public Set<Mon> getMonAns() {
//		return monAns;
//	}
//
//	public void setMonAns(Set<Mon> monAns) {
//		this.monAns = monAns;
//	}

	public Set<Ban> getBans() {
		return bans;
	}

	public void setBans(Set<Ban> bans) {
		this.bans = bans;
	}

	public Set<Mon> getMonAns() {
		return monAns;
	}

	public void setMonAns(Set<Mon> monAns) {
		this.monAns = monAns;
	}

	public int getSoLuongMon() {
		return soLuongMon;
	}

	public void setSoLuongMon(int soLuongMon) {
		this.soLuongMon = soLuongMon;
	}

	public BigDecimal getTienCoc() {
		return tienCoc;
	}

	public void setTienCoc(BigDecimal tienCoc) {
		this.tienCoc = tienCoc;
	}

	public LocalDate getNgayDatMon() {
		return ngayDatMon;
	}

	public void setNgayDatMon(LocalDate ngayDatMon) {
		this.ngayDatMon = ngayDatMon;
	}

	public LocalDate getNgaySuDung() {
		return ngaySuDung;
	}

	public void setNgaySuDung(LocalDate ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}

	public String getGioSuDung() {
		return gioSuDung;
	}

	public void setGioSuDung(String gioSuDung) {
		this.gioSuDung = gioSuDung;
	}

	public String gettrangThaiThanhToan() {
		return trangThaiThanhToan;
	}

	public void settrangThaiThanhToan(String trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}

//	public int getSoLuong() {
//		return soLuong;
//	}
//
//	public void setSoLuong(int soLuong) {
//		this.soLuong = soLuong;
//	}

	public int getSoLuongNguoi() {
		return soLuongNguoi;
	}

	public void setSoLuongNguoi(int soLuongNguoi) {
		this.soLuongNguoi = soLuongNguoi;
	}

	public String getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}

	public void setTrangThaiThanhToan(String trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

}

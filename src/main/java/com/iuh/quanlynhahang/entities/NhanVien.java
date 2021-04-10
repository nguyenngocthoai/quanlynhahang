package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: NhanVien
 *
 */
@Entity

public class NhanVien implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String maNhanVien;
	private String hoTenNhanVien;
	private LocalDate ngaySinh;
	private int gioiTinh;
	private String diaChi;
	private String soDienThoai;
	private int tinhTrang;
//	@JoinColumn(name = "maTaiKhoan")
//	@OneToOne(optional=false, mappedBy="nhanVien")
	@OneToOne(mappedBy="nhanVien",cascade=CascadeType.ALL,fetch=FetchType.EAGER,optional = false)
	private TaiKhoan taiKhoan;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNhanVien, String hoTenNhanVien, LocalDate ngaySinh, int gioiTinh, String diaChi,
			String soDienThoai, int tinhTrang) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTenNhanVien = hoTenNhanVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.tinhTrang = tinhTrang;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getHoTenNhanVien() {
		return hoTenNhanVien;
	}

	public void setHoTenNhanVien(String hoTenNhanVien) {
		this.hoTenNhanVien = hoTenNhanVien;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}

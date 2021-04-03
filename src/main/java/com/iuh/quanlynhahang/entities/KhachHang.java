package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: KhachHang
 *
 */
@Entity

public class KhachHang implements Serializable {
	@Id
	private String maKhachhang;
	private String tenKhachhang;
	private LocalDate ngaySinh;
	private int gioiTinh;
	private String soDienThoai;
	private String diaChi;

	private static final long serialVersionUID = 1L;

	public KhachHang() {
		super();
	}

	public String getMaKhachhang() {
		return maKhachhang;
	}

	public void setMaKhachhang(String maKhachhang) {
		this.maKhachhang = maKhachhang;
	}

	public String getTenKhachhang() {
		return tenKhachhang;
	}

	public void setTenKhachhang(String tenKhachhang) {
		this.tenKhachhang = tenKhachhang;
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

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

}

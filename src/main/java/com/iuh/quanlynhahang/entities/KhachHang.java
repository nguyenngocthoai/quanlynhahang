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
	@Column(columnDefinition = "nvarchar(50)")
	private String tenKhachHang;
	@Column(columnDefinition = "nvarchar(10)")
	private String gioiTinh;
	private String soDienThoai;
	@Column(columnDefinition = "nvarchar(200)")
	private String diaChi;

	private static final long serialVersionUID = 1L;

	public KhachHang() {
		super();
	}
	

	public KhachHang(String maKhachhang, String tenKhachHang, String gioiTinh, String soDienThoai, String diaChi) {
		super();
		this.maKhachhang = maKhachhang;
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}


	public String getMaKhachhang() {
		return maKhachhang;
	}

	public void setMaKhachhang(String maKhachhang) {
		this.maKhachhang = maKhachhang;
	}

	public String getTenKhachhang() {
		return tenKhachHang;
	}

	public void setTenKhachhang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
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

package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LoaiTaiKhoan
 *
 */
@Entity

public class LoaiTaiKhoan implements Serializable {
	@Id
	private String maLoaiTaiKhoan;
	private String tenLoaiTaiKhoan;
	private static final long serialVersionUID = 1L;

	public LoaiTaiKhoan() {
		super();
	}

	public String getMaLoaiTaiKhoan() {
		return maLoaiTaiKhoan;
	}

	public void setMaLoaiTaiKhoan(String maLoaiTaiKhoan) {
		this.maLoaiTaiKhoan = maLoaiTaiKhoan;
	}

	public String getTenLoaiTaiKhoan() {
		return tenLoaiTaiKhoan;
	}

	public void setTenLoaiTaiKhoan(String tenLoaiTaiKhoan) {
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}

}

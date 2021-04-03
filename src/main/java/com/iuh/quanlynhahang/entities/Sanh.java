package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: KhuVuc
 *
 */
@Entity

public class Sanh implements Serializable {

	@Id
	private String maSanh;
	private String tenSanh;

	private static final long serialVersionUID = 1L;

	public Sanh() {
		super();
	}

	public String getMaSanh() {
		return maSanh;
	}

	public void setMaSanh(String maSanh) {
		this.maSanh = maSanh;
	}

	public String getTenSanh() {
		return tenSanh;
	}

	public void setTenSanh(String tenSanh) {
		this.tenSanh = tenSanh;
	}

}

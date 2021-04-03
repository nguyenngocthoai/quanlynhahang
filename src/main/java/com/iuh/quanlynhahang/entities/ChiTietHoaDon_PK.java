package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChiTietHoaDon_PK
 *
 */
@Embeddable

public class ChiTietHoaDon_PK implements Serializable {
	private String hoaDon;
	private String thucDon;

	private static final long serialVersionUID = 1L;

	public ChiTietHoaDon_PK() {
		super();
	}

	public String getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(String hoaDon) {
		this.hoaDon = hoaDon;
	}

	public String getThucDon() {
		return thucDon;
	}

	public void setThucDon(String thucDon) {
		this.thucDon = thucDon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((thucDon == null) ? 0 : thucDon.hashCode());
		result = prime * result + ((hoaDon == null) ? 0 : hoaDon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDon_PK other = (ChiTietHoaDon_PK) obj;
		if (thucDon == null) {
			if (other.thucDon != null)
				return false;
		} else if (!thucDon.equals(other.thucDon))
			return false;
		if (hoaDon == null) {
			if (other.hoaDon != null)
				return false;
		} else if (!hoaDon.equals(other.hoaDon))
			return false;
		return true;
	}

}

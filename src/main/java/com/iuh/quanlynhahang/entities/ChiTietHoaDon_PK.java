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
	private String banTiec;

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

	public String getBanTiec() {
		return banTiec;
	}

	public void setBanTiec(String banTiec) {
		this.banTiec = banTiec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banTiec == null) ? 0 : banTiec.hashCode());
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
		if (banTiec == null) {
			if (other.banTiec != null)
				return false;
		} else if (!banTiec.equals(other.banTiec))
			return false;
		if (hoaDon == null) {
			if (other.hoaDon != null)
				return false;
		} else if (!hoaDon.equals(other.hoaDon))
			return false;
		return true;
	}

}
